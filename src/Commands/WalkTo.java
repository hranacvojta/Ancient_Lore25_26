package Commands;

import Other.GameData;
import Other.Room;

import java.util.Scanner;




public class WalkTo implements Command {


    private final Other.Console console;



    Room playersLocation;
    GameData gameData;


    public WalkTo(Other.Console console) {
        this.console = console;
    }

    @Override
    public String execute(String command) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the location you want to walk to");
        String requestedLocation = sc.nextLine().trim().toLowerCase();

        for (Room room : console.getGameData().rooms){
            if  (room.getId().equals(requestedLocation.trim().toLowerCase())){
                if (room.isUnlocked() == false){
                    System.out.println("You cant go here yet...");
                }else{
                    System.out.print("You are traveling to location:" + room.getRoomName());
                    console.setActiveRoom(room);
                }
            }

        }

        return "";

    }


    @Override
    public boolean exit() {
        return false;
    }


}