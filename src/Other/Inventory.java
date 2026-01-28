package Other;

import Items.Item;

import java.util.ArrayList;


public class Inventory {

    private ArrayList<Item> inventory;
    private int capacity;

    public Inventory( int capacity) {
        this.inventory = new ArrayList<>();
        this.capacity = capacity;
    }


    public void addItem(Item item) {
        if (item == null) {
            System.out.println("object is null...");
        } else {
            inventory.add(item);
            System.out.println("item added...");
        }
    }

    public void removeItem(Item item) {
        if (item == null) {
            System.out.println("item is null...");
        }else {
            inventory.remove(item);
            System.out.println("item removed...");
        }


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
