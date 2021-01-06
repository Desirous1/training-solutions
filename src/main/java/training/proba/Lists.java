package training.proba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        if ( list1.isEmpty()) {
            System.out.println("list1 üresen: " + list1);
        }
        list1.add("a");
        System.out.println("list1 : "+ list1);

        List<String> list2 = Arrays.asList("a", "b", "c");   // fix lista, de módosítható
        //list2.add("d");  // ez nem lehetséges
        //list2.set(0, "xxx"); // ez működik
        System.out.println("list2 : " + list2);  // ez elszáll ha hozzá próbálunk adni

        List<String> list3 = List.of("a", "b", "c"); // nem módosítható lista
        //System.out.println("list3 : " + list3);
        // list3.add("R"); // ez nem működik és elszáll
        //list3.set(0, "xxx"); // ez sem működik és elszáll
        System.out.println("list3 : " + list3);  // elszáll

        List<String> list4 = new ArrayList<>(list3); // megkapja a list3-at ami nem módosítható
        System.out.println("list4 : " + list4);
        list4.add("E");  // a list4 egy módosítható példány ezért adhatunk hozzá
        System.out.println("list4 mód.: " + list4); // ez működik

    }

}
