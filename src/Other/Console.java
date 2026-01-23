package Other;

import Characters.Player;
import Commands.Command;
import Commands.WalkTo;

import java.util.HashMap;
import java.util.Scanner;

public class Console {
    Player p;


    Scanner sc = new Scanner(System.in);

    GameData data = GameData.loadGameDataFromResources("/gamedata.json");

    private Room activeRoom;



    private boolean exit = false;




    private HashMap<String, Command> commands = new HashMap<>();

    public void inicialization() {
        commands.put("walkto", new WalkTo());
        System.out.println("rooms " + data.rooms.size());
        System.out.println("armor: " + data.armor.size());
        System.out.println("Weapons: " + data.weapons.size());
        System.out.println("Shields: " + data.shields.size());
        System.out.println("FriendlyAndNeutrals:" + data.friendlyOrNeutralCharacters.size());
        System.out.println("Hostiles: " + data.hostileCharacters.size());

        activeRoom = data.rooms.get(0);

    }





    public void execute() {
        System.out.print(" -- ");
        String command = sc.nextLine();
        command = command.trim().toLowerCase();
        String[] listCom = command.trim().toLowerCase().split(" ");
        if (commands.containsKey(listCom[0])) {
            if (commands.get(command) instanceof WalkTo walkTo){
                walkTo.setPlayersLocation(activeRoom);
            }
            if (listCom.length>2){
                System.out.println("command too long");
                return;
            }
            if (listCom.length==2){
                System.out.println(commands.get(listCom[0]).execute(listCom[1]));
            }
            if (listCom.length==1){
                System.out.println(commands.get(listCom[0]).execute(""));
            }




        }else {
            System.out.println("Invalid command");
        }
    }





    public void start() {
        inicialization();

        do{
            execute();
        }while(!exit);


    }





}