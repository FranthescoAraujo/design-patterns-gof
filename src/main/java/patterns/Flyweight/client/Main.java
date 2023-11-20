package patterns.Flyweight.client;

import patterns.Flyweight.pattern.FlywheightFactory;
import patterns.Flyweight.pattern.Soldier;

public class Main {
    
    public static void main(String[] args) {
        
        FlywheightFactory factory = new FlywheightFactory();

        Soldier soldier1 = factory.getSoldier(0);
        Soldier soldier2 = factory.getSoldier(1);
        Soldier soldier3 = factory.getSoldier(2);
        Soldier soldier4 = factory.getSoldier(3);
        Soldier soldier5 = factory.getSoldier(4);

        Soldier soldier6 = factory.getSoldier(2);
        Soldier soldier7 = factory.getSoldier(3);
        Soldier soldier8 = factory.getSoldier(4);

        System.out.println(soldier1.toString());
        System.out.println(soldier2.toString());
        System.out.println(soldier3.toString());
        System.out.println(soldier4.toString());
        System.out.println(soldier5.toString());
        System.out.println(soldier6.toString());
        System.out.println(soldier7.toString());
        System.out.println(soldier8.toString());

    }

}
