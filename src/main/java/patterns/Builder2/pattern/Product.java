package patterns.Builder2.pattern;

public class Product {
    
    public String table;
    public String query;

    public final String MYSQL_QUERY = "SELECT * FROM `%s`";
    public final String POSTGRES_QUERY = "SELECT * FROM %s";

    public String getQuery() {
        return String.format(query, table);
    }

}
