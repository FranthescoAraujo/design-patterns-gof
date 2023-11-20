package patterns.Memento.pattern;

public class Entity {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entity clone() {
        Entity newEntity = new Entity();
        newEntity.setName(name);
        return newEntity;
    }

}
