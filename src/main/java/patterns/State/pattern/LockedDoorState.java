package patterns.State.pattern;

public class LockedDoorState extends AbstractDoorState {
    
    @Override
    public DoorState unlock() {
        return new ClosedDoorState();
    }

}
