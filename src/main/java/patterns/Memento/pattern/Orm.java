package patterns.Memento.pattern;

public class Orm {
    
    private Entity entity;
    private Memento memento;

    public Orm(Entity entity) {
        this.entity = entity;
    }

    public void save(String name) {
        backupToMemento();
        entity.setName(name);
    }

    public void delete() {
        backupToMemento();
        entity = null;
    }

    public String find() {
        if (entity != null) {
            return entity.getName();
        }
        return "no result";
    }

    public void undo() {
        entity = memento.getState();
    }

    public void backupToMemento() {
        memento = new Memento(entity);
    }

}
