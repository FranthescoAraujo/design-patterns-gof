package patterns.Facade.pattern;

import patterns.Flyweight.pattern.FlywheightFactory;
import patterns.Flyweight.pattern.Soldier;

public class Facade {
    
    private Integer numberOfSoldier = 1;
    private FlywheightFactory factory;

    public Facade(Integer numberOfSoldier) {
        this.numberOfSoldier = numberOfSoldier;
        factory = new FlywheightFactory();
    }

    public void createSoldiers() {
        for(int i = 0; i < numberOfSoldier; i++) {
            Soldier soldier = factory.getSoldier(i);
            System.out.println(soldier);
        }
    }

    public void showSoldiers() {
        for(int i = 0; i < numberOfSoldier; i++) {
            Soldier soldier = factory.getSoldier(i);
            System.out.println(soldier);
        }
    }

}
