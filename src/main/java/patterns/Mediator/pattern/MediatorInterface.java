package patterns.Mediator.pattern;

public interface MediatorInterface {
    
    public void sendResult(String content);
    public void makeRequest();
    public String queryDb();

}
