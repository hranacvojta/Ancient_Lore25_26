

public class Main {
    public static void main(String[] args) {

        //Tohle bude fajn schovat do nějaké třídy, ve které budeme pracovat se všemi daty a hráčem
        GameData data = GameData.loadGameDataFromResources("/gamedata.json");

        //Zkouška, zdali načtení proběhlo v pořádku
        System.out.println("armor: " + data.armor.size());
        System.out.println("Weapons: " + data.weapons.size());
        System.out.println("Shields: " + data.shields.size());
        System.out.println("FriendlyAndNeutrals: " + data.hostileCharacters.size());
        System.out.println("Hostiles:" + data.friendlyOrNeutralCharacters.size());

        //Nalezení konkrétní lokace, se kterou je pak možno dále pracovat
//        System.out.println("Start lokace: " + data.findLocation("loc_crossroads").getName());

    }


}