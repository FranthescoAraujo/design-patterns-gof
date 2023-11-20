package patterns.Mediator.pattern;

public class ClientColleague extends Colleague {
    
    public void request() {
        mediator.makeRequest();
    }

    public void output(String context) {
        System.out.println(context);
    }

}
