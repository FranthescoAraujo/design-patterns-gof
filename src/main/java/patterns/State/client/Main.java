package patterns.State.client;

import patterns.State.pattern.Door;
import patterns.State.pattern.OpenDoorState;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Door door = new Door(new OpenDoorState());
        System.out.println(door.isOpen());

        door.close();
        System.out.println(door.isClosed());

        door.lock();
        System.out.println(door.isLocked());

        door.lock();
        
    }

}
