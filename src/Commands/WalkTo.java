package Commands;

import Other.GameData;
import Other.Room;

import java.util.Scanner;




public class WalkTo implements Command {


    final Other.Console console;
    Scanner sc = new Scanner(System.in);



    private Room playersLocation;
    GameData gameData;
    Room r;


    public WalkTo(Other.Console console) {
        this.console = console;
    }

    @Override
    public String execute(String command) {


        System.out.println("Enter the location you want to walk to");
        String requestedLocation = sc.nextLine().trim().toLowerCase();

        if (console.getActiveRoom().getAviableRooms().contains(requestedLocation)) {
            console.setActiveRoom(r.getRoom(requestedLocation));
        }

        return "You have entered: " + console.getActiveRoom().getRoomName();

    }




    @Override
    public boolean exit() {
        return false;
    }
}