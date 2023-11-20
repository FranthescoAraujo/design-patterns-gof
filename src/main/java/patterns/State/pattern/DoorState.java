package patterns.State.pattern;

public interface DoorState {
    
    public DoorState open();
    public DoorState close();
    public DoorState lock();
    public DoorState unlock();

}
