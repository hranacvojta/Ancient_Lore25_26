package Commands;

import Other.GameData;
import Other.Room;

import java.util.Scanner;




public class WalkTo implements Command {


    private final Other.Console console;


    /**
     * 1. asks in which location player wants to go
     * 2. if its accessible (must be unlocked and not completed) players actual location (activeLocation) sets to new location
     * @param console command base
     * @return execute method retutrns active room (players location)
     */
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
                if (room.isUnlocked() == false || room.isCompleted() == true) {
                    System.out.println("You cant go here...");
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