package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {

    @Test
    public void testRemove() {
        List<Integer> k = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//        for (int i : k) {
//            if (i % 2 == 0) {
//                k.remove(Integer.valueOf(i));
//            }
//        }

        Iterator<Integer> i = k.iterator();
        while (i.hasNext()) {
            int j = i.next();
            System.out.println(j);
            if (j % 2 == 0) {
                i.remove();
            }
        }
        System.out.println(k);
        assertEquals(Arrays.asList(1,3,5,7), k);

    }
}
