package patterns.Builder2.pattern;

public class DirectorMySql implements Director {
    
    private Builder builder;

    private DirectorMySql(Builder builder) {
        this.builder = builder;
    }

    public String getQuery() {
        return builder.getProduct().getQuery();
    }

    public static class MySqlBuilder implements Builder {

        private Product product;
    
        public MySqlBuilder() {
            product = new Product();
        }
    
        @Override
        public Builder setTable(String table) {
            product.table = table;
            return this;
        }
    
        @Override
        public Builder setQuery() {
            product.query = product.MYSQL_QUERY;
            return this;
        }

        @Override
        public Product getProduct() {
            return product;
        }

        @Override
        public Director build() {
            return new DirectorMySql(this);
        }
        
    }

}
