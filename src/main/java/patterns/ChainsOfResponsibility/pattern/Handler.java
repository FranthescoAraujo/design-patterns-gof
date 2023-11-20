package patterns.ChainsOfResponsibility.pattern;

public abstract class Handler {
    
    private Handler successor;

    public void execute() {
        if (successor == null) {
            return;
        }
        successor.execute();
    }

    public void successor(Handler successor) {
        this.successor = successor;
    }

    public Handler next() {
        return successor;
    }

}
