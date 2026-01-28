package Items;

import java.util.ArrayList;

public class Weapon extends Item {

    private int damage;
    private boolean twoHanded = false;
    private double dexterityRequired;


    @Override
    public String toString() {
        return "Weapon{" +
                " itemName='" + itemName + '\'' +
                ", damage=" + damage +
                ", twoHanded=" + twoHanded +
                ", dexterityRequired=" + dexterityRequired +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
