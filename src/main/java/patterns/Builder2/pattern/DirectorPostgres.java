package patterns.Builder2.pattern;

public class DirectorPostgres implements Director {
    
    private Builder builder;

    private DirectorPostgres(Builder builder) {
        this.builder = builder;
    }

    public String getQuery() {
        return builder.getProduct().getQuery();
    }

    public static class PostgresBuilder implements Builder {

        private Product product;
    
        public PostgresBuilder() {
            product = new Product();
        }
    
        @Override
        public Builder setTable(String table) {
            product.table = table;
            return this;
        }
    
        @Override
        public Builder setQuery() {
            product.query = product.POSTGRES_QUERY;
            return this;
        }

        @Override
        public Product getProduct() {
            return product;
        }

        @Override
        public Director build() {
            return new DirectorPostgres(this);
        }
        
    }

}
