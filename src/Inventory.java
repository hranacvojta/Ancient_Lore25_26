import Items.Item;

import java.util.ArrayList;


public class Inventory {

    private ArrayList<Item> inventory;
    private int capacity;

    public Inventory(ArrayList<Item> inventory, int capacity) {
        this.inventory = inventory;
        this.capacity = capacity;
    }


    public void addItem(Item item) {
        if (item == null) {
        } else {
            inventory.add(item);
            //TODO dodelat metodu
        }
    }

    public void removeItem(Item item) {
        //TODO dodelat metodu
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
