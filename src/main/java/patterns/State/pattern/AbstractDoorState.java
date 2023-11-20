package patterns.State.pattern;

public class AbstractDoorState implements DoorState {

    @Override
    public DoorState open() {
        throw new UnsupportedOperationException("Unimplemented method 'open'");
    }

    @Override
    public DoorState close() {
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    @Override
    public DoorState lock() {
        throw new UnsupportedOperationException("Unimplemented method 'lock'");
    }

    @Override
    public DoorState unlock() {
        throw new UnsupportedOperationException("Unimplemented method 'unlock'");
    }
    
}
