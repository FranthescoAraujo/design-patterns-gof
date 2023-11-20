package patterns.ChainsOfResponsibility.client;

import patterns.ChainsOfResponsibility.pattern.After;
import patterns.ChainsOfResponsibility.pattern.Before;
import patterns.ChainsOfResponsibility.pattern.Handler;
import patterns.ChainsOfResponsibility.pattern.Request;

public class Main {
    
    public static void main(String[] args) {
        
        Handler before = new Before();
        Handler request = new Request();
        Handler after = new After();

        Handler auth = new Handler() {
            @Override
            public void execute() {
                System.out.println("Auth");
                super.execute();
            }
        };

        auth.successor(before);
        before.successor(request);
        request.successor(after);

        auth.execute();

    }

}
