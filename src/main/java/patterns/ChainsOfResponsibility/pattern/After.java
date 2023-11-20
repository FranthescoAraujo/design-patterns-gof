package patterns.ChainsOfResponsibility.pattern;

public class After extends Handler {

    @Override
    public void execute() {
        System.out.println("After");
        super.execute();
    }
    
}
