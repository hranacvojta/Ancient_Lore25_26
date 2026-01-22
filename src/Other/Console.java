package Other;

import Commands.Command;
import Commands.WalkTo;

import java.util.HashMap;

public class Console {

    GameData data = GameData.loadGameDataFromResources("/gamedata.json");


    public void reasuringFunc(){
        System.out.println("rooms " + data.rooms.size());
        System.out.println("armor: " + data.armor.size());
        System.out.println("Weapons: " + data.weapons.size());
        System.out.println("Shields: " + data.shields.size());
        System.out.println("FriendlyAndNeutrals:" + data.friendlyOrNeutralCharacters.size());
        System.out.println("Hostiles: " + data.hostileCharacters.size());
    }



    private HashMap<String, Command> commands;





    public void inicialization(){
        commands.put("walkTo", new WalkTo());

    }

    public void execute(){
    }//TODO dodelat metodu

    public void start(){
        inicialization();
//TODO dodelat metodu
    }
}
