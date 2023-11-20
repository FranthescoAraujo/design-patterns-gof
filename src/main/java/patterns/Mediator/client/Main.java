package patterns.Mediator.client;

import patterns.Mediator.pattern.ClientColleague;
import patterns.Mediator.pattern.DatabaseColleague;
import patterns.Mediator.pattern.Mediator;
import patterns.Mediator.pattern.ServerColleague;

public class Main {
    
    public static void main(String[] args) {
        ClientColleague client = new ClientColleague();
        new Mediator(client, new ServerColleague(), new DatabaseColleague());

        client.request();
    }

}
