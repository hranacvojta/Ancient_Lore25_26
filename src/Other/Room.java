package Other;

import Items.Item;

import java.util.ArrayList;

public class Room {

    private String roomName;
    private boolean unlocked =  false;
    private boolean completed = false;
    private int idOfLocation;
    private ArrayList<Item> droppedItems;
    private ArrayList<String> aviableRooms;


    public String getRoomName() {
        return roomName;
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

    public int getIdOfLocation() {
        return idOfLocation;
    }

    public void setIdOfLocation(int idOfLocation) {
        this.idOfLocation = idOfLocation;
    }

    public ArrayList<Item> getDroppedItems() {
        return droppedItems;
    }

    public void setDroppedItems(ArrayList<Item> droppedItems) {
        this.droppedItems = droppedItems;
    }
}
