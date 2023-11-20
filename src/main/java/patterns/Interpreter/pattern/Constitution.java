package patterns.Interpreter.pattern;

public class Constitution implements Interpreter {
    
    private int value;

    public Constitution(int value) {
        this.value = value;
    }

    @Override
    public int interpret(int mod) {
        return value + mod;
    }

}
