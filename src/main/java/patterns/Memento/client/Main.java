package patterns.Memento.client;

import patterns.Memento.pattern.Entity;
import patterns.Memento.pattern.Orm;

public class Main {
    
    public static void main(String[] args) {
        Entity user = new Entity();
        user.setName("Name 01");

        Orm orm = new Orm(user);
        System.out.println(orm.find());

        System.out.println("Update name");
        orm.save("Name 02");
        System.out.println(orm.find());

        System.out.println("Restone with memento");
        orm.undo();
        System.out.println(orm.find());

        System.out.println("Remove entity");
        orm.delete();
        System.out.println(orm.find());

        System.out.println("Restone with memento");
        orm.undo();
        System.out.println(orm.find());
    }
}
