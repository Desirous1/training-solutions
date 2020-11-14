package classstructureconstructors;

import java.awt.*;

public class StoreMain {

    public static void main(String[] args) {

        Store store = new Store("Apple");
        System.out.println("1. raktár: " + store.getProduct() + "\nKészlet: " + store.getStock());
        store.store(15);
        System.out.println("Növelés 15-el");
        System.out.println("Új készlet: " + store.getStock());
        store.dispatch(3);
        System.out.println("Csökkentés 3-al");
        System.out.println("Új készlet: " + store.getStock());

        Store anotherStore = new Store("Pearl");
        System.out.println("2. raktár: " + anotherStore.getProduct() + "\nKészlet: " + anotherStore.getStock());
        anotherStore.store(20);
        System.out.println("Növelés 20-al");
        System.out.println("Új készlet: " + anotherStore.getStock());
        anotherStore.dispatch(8);
        System.out.println("Csökkentés 8-al");
        System.out.println("Új készlet: " + anotherStore.getStock());
    }
}
