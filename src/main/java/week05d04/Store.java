package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public boolean addProduct(Product paraProduct) {
        if((!isValid(paraProduct))) {
            return false;
        }
        products.add(paraProduct);
        return true;
    }

    public int getNumberOfRxpired() {
        int count = 0;
        for (Product p : products) {
            if (p.isExpired()) {
                count++;
            }
        }
        return count;
    }


    private boolean isValid(Product paraProduc) {
        if(containsByName(paraProduc) || paraProduc.isExpired()){
            return false;
        }
        return  true;
    }

    private  boolean containsByName(Product paraProduct) {
        for (Product p: products ) {
            if(p.getName().equals(paraProduct.getName())){
                return true;
            }
        }
        return false;
    }

}

/*Mai feladat Junior/Mid-Level:
Készíts egy week05d04.Product osztályt melyben egy termékről tárolod a nevét és a lejárati dátumát (LocalDate).
Legyen egy konstruktora, ami a nevet kapja meg illetve a lejárati dátumot három részletben int year,
int month, int day. (public Product(String name, int year, int month, int day))
A lejárati dátumot a konstruktorban állítsd össze.
Legyen mindkettőhöz getter metódus.
Készíts egy week05d04.Store osztályt, melyben van egy Productokat tároló lista. Legyen benne egy addProduct(Product) metódus.
Bónusz: Legyen benne egy getNumberOfExpired() metódus ami visszaadja a lejárt termékek számát. Használd a LocalDate.now() és az isBefore() metódusokat.
Tesztelj! (edited) */