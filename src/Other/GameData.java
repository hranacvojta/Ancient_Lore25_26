package Other;

import Characters.FriendlyOrNeutralCharacter;
import Characters.HostileCharacter;
import Items.Armor;
import Items.Weapon;
import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class GameData {


    public ArrayList<Other.Room> rooms;
    ArrayList<Armor> armor;
    ArrayList<Weapon> weapons;
    ArrayList<Armor> shields;
    ArrayList<FriendlyOrNeutralCharacter> friendlyOrNeutralCharacters;
    ArrayList<HostileCharacter> hostileCharacters;

    public ArrayList<Room> getRooms(String requestedLocation) {
        return rooms;
    }

    /**
     * Loads game data from a JSON file.
     * @param resourcePath path to the resource file
     * @return a  object filled with the loaded data
     */

    public static GameData loadGameDataFromResources(String resourcePath) {
        //Vytvoření objektu pro práci s JSON souborem
        Gson gson = new Gson();

        //Načtení souboru gamedata.json, musí být ve složce res/resources, ta musí být označena jako resource složka projektu
        try (InputStream is = GameData.class.getResourceAsStream(resourcePath)) {
            //Zde ověřujeme, zdali soubor existuje
            if (is == null) {
                throw new IllegalStateException("Nenalezen resource: " + resourcePath +
                        " (zkontrolujte, že soubor je v src/main/resources).");
            }

            //Přečte celý JSON a vytvoří instanci Other.GameData, naplní vlastnosti podle názvů klíčů v JSONU, vrátí se hotová třída Other.GameData
            return gson.fromJson(
                    new InputStreamReader(is, StandardCharsets.UTF_8),
                    GameData.class
            );

        } catch (Exception e) {
            throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
        }

    }



    /**
     * Finds a specific location by its identifier.
     * @param id the identifier of the location to be found
     * @return the matching location
     */

}
