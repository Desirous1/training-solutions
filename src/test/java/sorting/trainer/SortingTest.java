package sorting.trainer;

import org.junit.jupiter.api.Test;

import javax.swing.event.ListSelectionEvent;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {

    @Test
    public void testSortArray() {
        int[] i = {3, 1, 6, 9, 5, 3};
        Arrays.sort(i);
        assertEquals(3, i[2]);
        assertArrayEquals(new int[]{1, 3, 3, 5, 6, 9}, i);
    }

    @Test
    public void testSortList() {
        List<Integer> i = Arrays.asList(3, 1, 6, 9, 5, 3);
        Collections.sort(i);
        System.out.println(i);

        List<Integer> e = Arrays.asList(3, 1, 6, 9, 5, 3);
        e.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        assertEquals(Arrays.asList(1, 3, 3, 5, 6, 9), e);
        System.out.println(e);
    }

    @Test
    public void testSet() {
        Set<String> s = new TreeSet<>();
        s.add("Jack");
        s.add("Joe");
        s.add("Jane");
        System.out.println(s);
    }

    @Test
    public void testSet2() {
        Set<String> s = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        s.add("Jack");
        s.add("Joe");
        s.add("Jane");
        System.out.println(s);
    }

    @Test
    public void testSet3() {
        Set<Trainer> d = new TreeSet<>();
        d.add(new Trainer("Jack", 3));
        d.add(new Trainer("Joe", 2));
        d.add(new Trainer("Jane", 1));
        System.out.println(d);
    }


}