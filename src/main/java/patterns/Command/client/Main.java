package patterns.Command.client;

import patterns.Command.pattern.Command;
import patterns.Command.pattern.LampReceiver;
import patterns.Command.pattern.TurnOffCommand;
import patterns.Command.pattern.TurnOnCommand;

public class Main {
    
    public static void main(String[] args) {
        
        if (args.length == 0) {
            return;
        }

        LampReceiver lamp = new LampReceiver();
        invoke(args[0], lamp);
        
    }

    public static void invoke(String arg, LampReceiver lamp) {
        if (arg == null) {
            return;
        }
        if (arg.equals("turn_on")) {
            Command turnOn = new TurnOnCommand(lamp);
            turnOn.execute();
        }
        if (arg.equals("turn_off")){
            Command turnOff = new TurnOffCommand(lamp);
            turnOff.execute();
        }    
    }

}
