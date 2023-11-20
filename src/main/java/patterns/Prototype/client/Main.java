package patterns.Prototype.client;

import patterns.Prototype.pattern.ConcretePrototype;

public class Main {
    
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setTitle("Title 01");
        prototype.setAuthor("Author 01");

        ConcretePrototype prototype2 = (ConcretePrototype) prototype.clone();
        prototype2.setTitle("Title 02");

        ConcretePrototype prototype3 = (ConcretePrototype) prototype.clone();
        prototype3.setTitle("Title 03");

        System.err.println(prototype);
        System.err.println(prototype2);
        System.err.println(prototype3);

    }

}
