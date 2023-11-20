package patterns.State.pattern;

public class Door {
    
    private DoorState state;

    public Door(DoorState state) {
        this.state = state;
    }

    public void open() {
        state = state.open();
    }

    public void close() {
        state = state.close();
    }

    public void lock() {
        state = state.lock();
    }

    public void unlock() {
        state = state.unlock();
    }

    public boolean isOpen() {
        return state instanceof OpenDoorState;
    }

    public boolean isClosed() {
        return state instanceof ClosedDoorState;
    }

    public boolean isLocked() {
        return state instanceof LockedDoorState;
    }

}
