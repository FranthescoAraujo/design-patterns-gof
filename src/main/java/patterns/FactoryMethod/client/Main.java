package patterns.FactoryMethod.client;

import patterns.FactoryMethod.pattern.Circle;
import patterns.FactoryMethod.pattern.ConcreteCreator;
import patterns.FactoryMethod.pattern.ProductInterface;
import patterns.FactoryMethod.pattern.Triangle;

public class Main {
    
    public static void main(String[] args) {
        ProductInterface product = new ConcreteCreator().factoryMethod(new Circle());
        System.out.println(product.getImage());

        product = new ConcreteCreator().factoryMethod(new Triangle());
        System.out.println(product.getImage());
    }

}
