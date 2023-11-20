package patterns.Interpreter.client;

import patterns.Interpreter.pattern.Constitution;
import patterns.Interpreter.pattern.Force;
import patterns.Interpreter.pattern.Interpreter;
import patterns.Interpreter.pattern.Level;
import patterns.Interpreter.pattern.Life;

public class Main {
    
    public static void main(String[] args) {
        Interpreter force = new Force(14);
        Interpreter constitution = new Constitution(13);
        Interpreter level = new Level(2);

        Interpreter life = new Life(force, constitution, level);
        System.out.println(life.interpret(0));
        System.out.println(life.interpret(2));
    }
}
