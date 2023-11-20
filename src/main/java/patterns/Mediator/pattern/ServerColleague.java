package patterns.Mediator.pattern;

public class ServerColleague extends Colleague {
    
    public void process() {
        String data = mediator.queryDb();
        mediator.sendResult("Hello " + data);
    }

}
