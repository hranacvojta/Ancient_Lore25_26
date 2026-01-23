package Commands;

import Other.GameData;

import java.io.Console;
import java.util.Scanner;

import Other.Room;




public class WalkTo implements Command {


    private Other.Console console;















    public WalkTo() {
        playersLocation = this.playersLocation;
    }

    private Console console;
    private Room playersLocation;
    GameData gameData;
    Room room;
    Scanner sc=new Scanner(System.in);

    @Override
    public String execute(String command) {



        if (playersLocation.getAviableRooms().contains(command)){
            setPlayersLocation();
        }




        switch (room.getRoomName()) {
            case "Barracks":
                System.out.println(room.getAviableRooms());
            case "Lohorice":
                System.out.println(room.getAviableRooms());
            case "ZdusyNadSazavou":
                System.out.println(room.getAviableRooms());
            case "ForestOfMonsters":
                System.out.println(room.getAviableRooms());
            case "EastMountainRange":
                System.out.println(room.getAviableRooms());
            case "Swamp":
                System.out.println(room.getAviableRooms());
            case "MiddleEarth":
                System.out.println(room.getAviableRooms());
        }



        return "";

    }


    public void setPlayersLocation(Room playersLocation) {
        this.playersLocation = playersLocation;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
