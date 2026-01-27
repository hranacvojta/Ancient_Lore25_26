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


//
//    public Room getRoom(String id) {
//
//        if (data.rooms == null) {
//            return null;
//        }
//        for (Room room : data.rooms) {
//            if (room.getId().equals(id.trim().toLowerCase())) {
//                return room;
//            }
//        }
//        return null;
//    }


//    public Room targetingRoom(String id){
//        for (Room room: data.rooms){
//
//            if (room.getId().equals(id.trim().toLowerCase())){
//                if (room.isUnlocked() == false){
//                    System.out.println("You cant go here yet...");
//                }else{
//                    System.out.print("You are traveling to location:" + room.getRoomName());
//                    con.setActiveRoom(room);
//                }
//            }
//            System.out.println("this location does not exists");
//        }
//        return null;
//    }



//    public String getTargetRoomName(String userInput) {
//        if (aviableRooms == null){
//            return null;
//        }
//
//        for (String room : aviableRooms) {
//            if (room.equalsIgnoreCase(userInput)) {
//                return room;
//            }
//        }
//        return null;
//    }


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