package week08d03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
       System.out.println(first+ " " + second);
        first = new ArrayList<>(first);
        for (String oi: second ) {
            if (!first.contains(oi)) {
         //       System.out.println(oi);
                first.add(oi);
            }
        }
        return first;
    }
}
