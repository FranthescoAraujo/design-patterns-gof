package patterns.Interpreter.pattern;

public class Life implements Interpreter {
    
    private Interpreter forca;
    private Interpreter constitution;
    private Interpreter level;

    public Life(Interpreter forca, Interpreter constitution, Interpreter level) {
        this.forca = forca;
        this.constitution = constitution;
        this.level = level;
    }

    @Override
    public int interpret(int mod) {
        double result = forca.interpret(0) + constitution.interpret(0);
        result = result/2;
        return (int) Math.ceil(result) + level.interpret(0) + mod;
    }

}
