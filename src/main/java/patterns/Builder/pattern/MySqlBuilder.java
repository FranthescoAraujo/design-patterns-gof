package patterns.Builder.pattern;

public class MySqlBuilder implements BuilderInterface {

    private Product product;

    public MySqlBuilder() {
        product = new Product();
    }

    @Override
    public void setTable(String table) {
        product.table = table;
    }

    @Override
    public void setQuery() {
        product.query = product.MYSQL_QUERY;
    }

    @Override
    public Product getResult() {
        return product;
    }

}
