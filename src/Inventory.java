import Items.Item;

import java.util.ArrayList;


public class Inventory {

    private ArrayList<Item> inventory;
    private int capacity;

    public Inventory(ArrayList<Item> inventory, int capacity) {
        this.inventory = inventory;
        this.capacity = capacity;
    }


    public boolean addItem(Item item) {
        return true; //TODO dodelat metodu
    }

    public boolean removeItem(Item item) {
        return true; //TODO dodelat metodu
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
