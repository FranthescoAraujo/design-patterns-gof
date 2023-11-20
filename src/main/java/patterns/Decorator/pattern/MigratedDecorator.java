package patterns.Decorator.pattern;

public class MigratedDecorator implements DecoratorInterface {

    private EntityInterface entity;

    @Override
    public void setEntity(EntityInterface entity) {
        this.entity = entity;
    }

    @Override
    public String operation() {
        return entity.getName() + " - migrated";
    }
    
}
