package patterns.Memento.pattern;

public class Memento {
    
    private Entity obj;

    public Memento(Entity obj) {
        this.obj = obj.clone();
    }

    public Entity getState() {
        return obj.clone();
    }

}
