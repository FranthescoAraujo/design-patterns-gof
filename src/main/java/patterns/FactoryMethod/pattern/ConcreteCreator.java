package patterns.FactoryMethod.pattern;

public class ConcreteCreator implements CreatorInterface {

    @Override
    public ProductInterface factoryMethod(ProductInterface product) {
        product.setDirectory("images");
        return product;
    }
    
}
