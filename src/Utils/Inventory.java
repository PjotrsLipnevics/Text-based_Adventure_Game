package Utils;

import java.util.LinkedList;

public class Inventory {
    private LinkedList<String> inventory = new LinkedList<>();


    Inventory(){

    }

    public void setInventory(LinkedList<String> inventory) {
        this.inventory = inventory;
    }

    public LinkedList<String> getInventory() {
        return inventory;
    }

    public void add(String item) {
        inventory.add(item);
    }

    public void remove(String item){
        inventory.remove(item);
    }

    public void show(){
    }
}
