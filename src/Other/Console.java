package Other;

import Characters.Character;
import Characters.FriendlyOrNeutralCharacter;
import Characters.Player;
import Commands.*;
import Items.Armor;
import Items.Weapon;

import java.sql.SQLOutput;
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
//        commands.put("achivements", new Achievements(this));
        commands.put("buy", new Buy (this, this.data, this.p));
        commands.put("drop", new Drop());
        commands.put("fight", new Fight());
        commands.put("help", new Help());
        commands.put("howtoplay", new HowToPlay());
        commands.put("pickup", new PickUp());
        commands.put("putoff", new PutOff());
        commands.put("puton", new PutOn());
        commands.put("speak", new Speak());
        commands.put("wheretogo", new WhereToGo(this));
        commands.put("actualpurse", new ActualPurse());
        System.out.println("rooms " + data.rooms.size());
        System.out.println("armor: " + data.armor.size());
        System.out.println("Weapons: " + data.weapons.size());
        System.out.println("FriendlyAndNeutrals:" + data.friendlyOrNeutralCharacters.size());
        System.out.println("Hostiles: " + data.hostileCharacters.size());
        System.out.println(activeRoom);
        System.out.println(data.theSmith.get(0));

//        System.out.println(data.theSmith.get(0).getWeaponsStore());
//        data.theSmith.get(0).getWeaponsStore().add(data.weapons.get(0));
//        System.out.println(data.theSmith.get(0).getWeaponsStore());
//        System.out.println(data.weapons.get(0));
//        data.theSmith.get(0).getWeaponsStore().contains(null);


        for (Weapon w : data.weapons) {
            data.theSmith.get(0).getWeaponsStore().add(w);
        }

        for (Armor a : data.armor) {
            data.theSmith.get(0).getArmorStore().add(a);
        }

        for (int i = 0; i < data.theSmith.get(0).getArmorStore().size(); i++) {
            System.out.println(data.theSmith.get(0).getArmorStore().get(i));

        }



//        for (int i = 0; i < data.theSmith.get(0).getWeaponsStore().size(); i++) {
//            System.out.println(data.theSmith.get(0).getWeaponsStore().get(i));
//
//        }

    }


    public void execute() {
        System.out.print(">> ");
        String input = sc.nextLine();
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
    public GameData getGameData() {
        return data;
    }

}