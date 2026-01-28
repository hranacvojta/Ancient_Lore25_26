package Other;

import Characters.FriendlyOrNeutralCharacter;
import Characters.HostileCharacter;
import Characters.SmithCharacter;
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
    ArrayList<FriendlyOrNeutralCharacter> friendlyOrNeutralCharacters;
    ArrayList<HostileCharacter> hostileCharacters;
    ArrayList<SmithCharacter> theSmith;

    public ArrayList<Room> getRooms(String requestedLocation) {
        return rooms;
    }

    public ArrayList<SmithCharacter> getTheSmith() {
        return theSmith;
    }

    /**
     * Loads game data from a JSON file.
     * @param resourcePath path to the resource file
     * @return a object filled with the loaded data
     */

    public static GameData loadGameDataFromResources(String resourcePath) {
        Gson gson = new Gson();

        try (InputStream is = GameData.class.getResourceAsStream(resourcePath)) {
            if (is == null) {
                throw new IllegalStateException("Nenalezen resource: " + resourcePath +
                        " (zkontrolujte, že soubor je v src/main/resources).");
            }

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
