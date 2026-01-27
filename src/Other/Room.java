package Other;

import Items.Item;

import java.util.ArrayList;

public class Room {

    private String roomName;
    private boolean unlocked =  false;
    private String id = "";
    private boolean completed = false;
    private ArrayList<Item> droppedItems;
    private ArrayList<String> aviableRooms;



    public Room() {}

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

    public ArrayList<Item> getDroppedItems() {
        return droppedItems;
    }

    public ArrayList<String> getAviableRooms() {
        return aviableRooms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", unlocked=" + unlocked +
                ", id='" + id + '\'' +
                ", completed=" + completed +
                ", droppedItems=" + droppedItems +
                ", aviableRooms=" + aviableRooms +
                '}';
    }
}