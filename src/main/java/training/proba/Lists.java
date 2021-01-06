package training.proba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("a");
        System.out.println("list1 : "+ list1);

        List<String> list2 = Arrays.asList("a", "b", "c");   // fix lista, de módosítható
        //list2.add("d");
        //list2.set(0, "xxx");
        System.out.println("list2 : " + list2);  // elszáll

        List<String> list3 = List.of("a", "b", "c"); // nem módosítható lista
        //System.out.println("list3 : " + list3);
        //list3.add("R");
       // list3.set(0, "xxx");
        System.out.println("list3 : " + list3);  // elszáll

        List<String> list4 = new ArrayList<>(list3);
        System.out.println("list4 : " + list4);
        list4.add("E");
        System.out.println("list4 mód.: " + list4);

    }

}
