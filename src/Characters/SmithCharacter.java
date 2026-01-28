package Characters;


import Items.Weapon;

import java.util.ArrayList;

public class SmithCharacter extends Character {


    int SmithStatus;
    boolean SmithBegging;


    private ArrayList<Weapon> weaponsStore = new ArrayList<>();
    private ArrayList<Weapon> armorStore = new ArrayList<>();
    private ArrayList<Weapon> shieldsStore = new ArrayList<>();


    public int getSmithStatus() {
        return SmithStatus;
    }

    public ArrayList<Weapon> getArmorStore() {
        return armorStore;
    }

    public ArrayList<Weapon> getShieldsStore() {
        return shieldsStore;
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
                ", shieldsStore=" + shieldsStore +
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
