package patterns.Decorator.client;

import patterns.Decorator.pattern.DecoratorInterface;
import patterns.Decorator.pattern.MigratedDecorator;
import patterns.Decorator.pattern.OrmDecorator;
import patterns.Decorator.pattern.User;

public class Main {
    
    public static void main(String[] args) {
        
        User user = new User();
        user.setName("User");

        DecoratorInterface decorator = new OrmDecorator();
        decorator.setEntity(user);
        System.out.println(decorator.operation());

        decorator = new MigratedDecorator();
        decorator.setEntity(user);
        System.out.println(decorator.operation());

    }

}
