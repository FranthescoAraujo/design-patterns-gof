package patterns.Builder.pattern;

public class Director {
    
    private BuilderInterface builder;

    public Director(BuilderInterface builder) {
        this.builder = builder;
    }

    public Product getQuery(String table) {
        builder.setTable(table);
        builder.setQuery();
        return builder.getResult();
    }

}
