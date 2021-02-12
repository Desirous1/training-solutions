package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    @Test
    public void testCollectios() {
        List<Integer> elements = new ArrayList<>();  // ez módosítható lista példányosítással
        //List<Integer> l = Collections.emptyList();
        elements.add(1);
        elements.add(2);
        List<Integer> l = Collections.unmodifiableList(elements);
        System.out.println(l);
        assertEquals(Arrays.asList(1, 2), l);
        elements.add(3);
        System.out.println(l);
        assertEquals(Arrays.asList(1, 2, 3), l);
    }


    @Test
    public void testReverse() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Collections.reverse(list);
        assertEquals(Arrays.asList(4, 3, 2, 1), list);
    }

    @Test
    public void testShuffle() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Random rnd = new Random(4);
        Collections.shuffle(list, rnd);
        System.out.println(list);
    }
}