package Other;

import Characters.Player;
import Commands.*;

import java.util.HashMap;
import java.util.Scanner;

public class Console {


    Scanner sc = new Scanner(System.in);
    GameData data = GameData.loadGameDataFromResources("/gamedata.json");
    private Room activeRoom = data.rooms.get(0);
    Player p;
    private boolean exit = false;




    private HashMap<String, Command> commands = new HashMap<>();
    public HashMap<String, Command> getCommands() {
        return commands;
    }


    public void inicialization() {
        commands.put("walkto", new WalkTo(this));
        commands.put("achivements", new Achievements());
        commands.put("buy", new Buy());
        commands.put("drop", new Drop());
        commands.put("fight", new Fight());
        commands.put("help", new Help());
        commands.put("howtoplay", new HowToPlay());
        commands.put("pickup", new PickUp());
        commands.put("putoff", new PutOff());
        commands.put("puton", new PutOn());
        commands.put("speak", new Speak());
        commands.put("wheretogo", new WhereToGo(this));
        System.out.println("rooms " + data.rooms.size());
        System.out.println("armor: " + data.armor.size());
        System.out.println("Weapons: " + data.weapons.size());
        System.out.println("Shields: " + data.shields.size());
        System.out.println("FriendlyAndNeutrals:" + data.friendlyOrNeutralCharacters.size());
        System.out.println("Hostiles: " + data.hostileCharacters.size());

        System.out.println(activeRoom);

    }


    public void execute() {
        System.out.print(">> ");
        String input = sc.next();
        input = input.trim().toLowerCase();
        if (commands.containsKey(input)) {
            System.out.println(">> " + commands.get(input).execute(input));
        }else {
            System.out.println(">> Nedefinovany prikaz");

        }
    }


    public void start() {
        inicialization();

        do{
            execute();
        }while(!exit);


    }


    public Room getActiveRoom() {
        return activeRoom;
    }

    public void setActiveRoom(Room activeRoom) {
        this.activeRoom = activeRoom;
    }

}