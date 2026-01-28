package Items;

import java.util.ArrayList;

public class Armor extends Item{

    private int inpenetrability;
    private BodyPartEnum bodyPart;


    @Override
    public String toString() {
        return "Armor{" +
                " itemName='" + itemName + '\'' +
                ", bodyPart=" + bodyPart +
                ", inpenetrability=" + inpenetrability +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
