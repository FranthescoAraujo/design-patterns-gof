package patterns.Interpreter.pattern;

public class Level implements Interpreter {
    
    private int value;

    public Level(int value) {
        this.value = value;
    }

    @Override
    public int interpret(int mod) {
        return value + mod;
    }

}
