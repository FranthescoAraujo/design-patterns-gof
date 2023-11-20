package patterns.Mediator.pattern;

public class Colleague {
    
    protected MediatorInterface mediator;

    public void setMediator(MediatorInterface mediator) {
        this.mediator = mediator;
    }

}
