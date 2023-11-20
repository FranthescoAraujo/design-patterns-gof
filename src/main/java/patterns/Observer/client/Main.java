package patterns.Observer.client;

import patterns.Observer.pattern.BinaryObserver;
import patterns.Observer.pattern.HexaObserver;
import patterns.Observer.pattern.OctalObserver;
import patterns.Observer.pattern.Subject;

public class Main {
    
    public static void main(String[] args) {
        
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }

}
