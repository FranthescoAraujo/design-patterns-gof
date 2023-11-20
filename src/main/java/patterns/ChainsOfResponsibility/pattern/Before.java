package patterns.ChainsOfResponsibility.pattern;

public class Before extends Handler {

    @Override
    public void execute() {
        System.out.println("Before");
        super.execute();
    }
    
}
