package patterns.Command.pattern;

public class TurnOffCommand implements Command {

    private LampReceiver receiver;

    public TurnOffCommand(LampReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }
    
}
