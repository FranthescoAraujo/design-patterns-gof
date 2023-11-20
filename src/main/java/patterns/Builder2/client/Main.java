package patterns.Builder2.client;

import patterns.Builder2.pattern.Director;
import patterns.Builder2.pattern.DirectorMySql;
import patterns.Builder2.pattern.DirectorPostgres;

public class Main {
    
    public static void main(String[] args) {
        
        Director director = new DirectorMySql.MySqlBuilder()
                                             .setTable("teste")
                                             .setQuery()
                                             .build();

        System.out.println(director.getQuery());

        director = new DirectorPostgres.PostgresBuilder()
                                       .setTable("teste")
                                       .setQuery()
                                       .build();

        System.out.println(director.getQuery());

    }

}
