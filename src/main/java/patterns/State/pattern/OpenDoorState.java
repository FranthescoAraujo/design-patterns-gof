package patterns.State.pattern;

public class OpenDoorState extends AbstractDoorState {

    @Override
    public DoorState close() {
        return new ClosedDoorState();
    }
    
}
