package patterns.Builder.pattern;

public class PostgresBuilder implements BuilderInterface {

    private Product product;

    public PostgresBuilder() {
        product = new Product();
    }

    @Override
    public void setTable(String table) {
        product.table = table;
    }

    @Override
    public void setQuery() {
        product.query = product.POSTGRES_QUERY;
    }

    @Override
    public Product getResult() {
        return product;
    }

}
