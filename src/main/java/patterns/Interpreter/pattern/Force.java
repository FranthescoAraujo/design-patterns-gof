package patterns.Interpreter.pattern;

public class Force implements Interpreter {
    
    private int value;

    public Force(int value) {
        this.value = value;
    }

    @Override
    public int interpret(int mod) {
        return value + mod;
    }

}
