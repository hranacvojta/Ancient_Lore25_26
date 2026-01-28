package Characters;


import Items.Armor;
import Items.Weapon;

import java.util.ArrayList;

public class SmithCharacter extends Character {


    int SmithStatus;
    boolean SmithBegging;


    private ArrayList<Weapon> weaponsStore = new ArrayList<>();
    private ArrayList<Armor> armorStore = new ArrayList<>();


    public int getSmithStatus() {
        return SmithStatus;
    }

    public ArrayList<Armor> getArmorStore() {
        return armorStore;
    }



    public boolean isSmithBegging() {
        return SmithBegging;
    }

    public ArrayList<Weapon> getWeaponsStore() {
        return weaponsStore;
    }

    @Override
    public String toString() {
        return "SmithCharacter{" +
                "SmithStatus=" + SmithStatus +
                ", SmithBegging=" + SmithBegging +
                ", weaponsStore=" + weaponsStore +
                ", armorStore=" + armorStore +
                ", characterName='" + characterName + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", combatSpeed=" + combatSpeed +
                ", completed=" + completed +
                ", overallInpenetrability=" + overallInpenetrability +
                ", id='" + id + '\'' +
                '}';
    }
}
