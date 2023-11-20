package patterns.Builder.client;

import patterns.Builder.pattern.Director;
import patterns.Builder.pattern.MySqlBuilder;
import patterns.Builder.pattern.PostgresBuilder;

public class Main {
    
    public static void main(String[] args) {
        
        Director director = new Director(new PostgresBuilder());
        String query = director.getQuery("teste").getQuery();
        System.out.println(query);

        director = new Director(new MySqlBuilder());
        query = director.getQuery("teste").getQuery();
        System.out.println(query);

    }

}
