package Other;

import Characters.Player;
import Commands.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Console {
    Player p;


    Scanner sc = new Scanner(System.in);

    GameData data = GameData.loadGameDataFromResources("/gamedata.json");

    private Room activeRoom;



    private boolean exit = false;




    private HashMap<String, Command> commands = new HashMap<>();

    public HashMap<String, Command> getCommands() {
        return commands;
    }

    public void inicialization() {
//        commands.put("walkto", new WalkTo());
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
        System.out.println("rooms " + data.rooms.size());
        System.out.println("armor: " + data.armor.size());
        System.out.println("Weapons: " + data.weapons.size());
        System.out.println("Shields: " + data.shields.size());
        System.out.println("FriendlyAndNeutrals:" + data.friendlyOrNeutralCharacters.size());
        System.out.println("Hostiles: " + data.hostileCharacters.size());

        activeRoom = data.rooms.get(0);

    }



    private ArrayList<Command> commands2 = new ArrayList<>();
    public void commandsAdd(){
        commands2.add(new Achievements());
        commands2.add(new Buy());
        commands2.add(new Drop());
        commands2.add(new Fight());
        commands2.add(new Help());
        commands2.add(new HowToPlay());
        commands2.add(new PickUp());
        commands2.add(new PutOff());
        commands2.add(new PutOn());
        commands2.add(new Speak());
    }




    public void execute() {
        System.out.print(" -- ");
        String input = sc.nextLine().trim().toLowerCase();
        input = input.trim().toLowerCase();
        for (int i = 0; i < commands.size(); i++) {

            if (input.equals(commands.get(i))){
                commands.get(i).execute(input);
            }else {
                System.out.println("invalid command");
            }
        }


    }





    public void start() {
        inicialization();

        do{
            execute();
        }while(!exit);


    }





}