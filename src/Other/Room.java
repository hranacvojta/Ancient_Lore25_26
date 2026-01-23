package Other;

import Items.Item;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;

public class Room {

    private String roomName;
    private boolean unlocked =  false;
    private boolean completed = false;
    private String actualRoomName;
    private ArrayList<Item> droppedItems;
    private ArrayList<String> aviableRooms;
    GameData data = new GameData();



    public String getRoomName() {
        return roomName;
    }

    public Room() {}



    public Other.Room getRoom(String name) {
        if (data.rooms == null) {
            return null;
        }
        for (Room room : data.rooms) {
            if (room.getRoomName().equalsIgnoreCase(name)) {
                return room;
            }
        }
        return null;
    }


    public String getTargetRoomName(String userInput) {
        if (aviableRooms == null) return null;

        for (String room : aviableRooms) {
            if (room.equalsIgnoreCase(userInput)) {
                return room;
            }
        }
        return null;
    }


    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getActualRoomName() {
        return actualRoomName;
    }

    public void setActualRoomName(String actualRoomName) {
        this.actualRoomName = actualRoomName;
    }

    public ArrayList<Item> getDroppedItems() {
        return droppedItems;
    }

    public ArrayList<String> getAviableRooms() {
        return aviableRooms;
    }

}
