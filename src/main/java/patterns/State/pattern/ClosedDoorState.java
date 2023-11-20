package patterns.State.pattern;

public class ClosedDoorState extends AbstractDoorState {

    @Override
    public DoorState open() {
        return new OpenDoorState();
    }

    @Override
    public DoorState lock() {
        return new LockedDoorState();
    }
    
}
