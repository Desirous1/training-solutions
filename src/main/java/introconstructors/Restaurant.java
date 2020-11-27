package introconstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * 4 ;
        this.menu = menuFel();
        //System.out.println("Name: " + name + " Capacity: " + capacity + "\nMenu: " + menu);
    }

    public List<String>  menuFel() {
        return Arrays.asList("\n Soup:", "\n Vegetable:", "\n Dessert:", "\n Boss offers:");
    }

    public String getName() {
        return name;
    }

    public List<String> getMenu() {
        return menu;
    }

    public int getCapacity() {
        return capacity;
    }

}
