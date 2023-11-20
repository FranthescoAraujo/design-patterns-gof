package patterns.Facade.client;

import patterns.Facade.pattern.Facade;

public class Main {
    
    public static void main(String[] args) {
        
        Facade facade = new Facade(10);
        facade.createSoldiers();
        System.out.println("\n");
        facade.showSoldiers();

    }

}
