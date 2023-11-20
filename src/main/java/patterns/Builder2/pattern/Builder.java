package patterns.Builder2.pattern;

public interface Builder {
    
    public Builder setTable(String table);
    public Builder setQuery();
    public Product getProduct();
    public Director build();
    
}
