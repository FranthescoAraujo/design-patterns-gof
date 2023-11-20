package patterns.Command.pattern;

public class TurnOnCommand implements Command {

    private LampReceiver receiver;

    public TurnOnCommand(LampReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }

}
