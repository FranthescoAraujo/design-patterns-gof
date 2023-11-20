package patterns.Mediator.pattern;

public class Mediator implements MediatorInterface {

    private ClientColleague client;
    private ServerColleague server;
    private DatabaseColleague database;

    public Mediator(ClientColleague client, ServerColleague server, DatabaseColleague database) {
        client.setMediator(this);
        server.setMediator(this);
        database.setMediator(this);
        this.client = client;
        this.server = server;
        this.database = database;
    }

    @Override
    public void sendResult(String content) {
        client.output(content);
    }

    @Override
    public void makeRequest() {
        server.process();
    }

    @Override
    public String queryDb() {
        return database.findData();
    }
    
}
