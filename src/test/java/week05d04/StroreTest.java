package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StroreTest {

    @Test
    // Lista készítés (Store osztály) tesztelése
    public void addProductTest() {

        Store store = new Store();
//        assertFalse(store.addProduct(new Product("milk", 2020, 11, 25)));

        assertTrue(store.addProduct(new Product("milk",2020,11,28)));
    }

    @Test
    public void getNumberOfExpired() {


    }

}
//        product.addProduct("akku");
//        System.out.println(store);
//        store.addProduct("Red Case");
//        System.out.println(store);

//        Product product = new Product("Blue Case", 2020, 11, 27);
//        //product("Blue Case", 2020, 11, 27);
//        System.out.println(store );

