package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerOperationsTest {

    @Test
    public void testAutoboxing(){
        List<Integer> k = new ArrayList<>();
        k.add(5);

        int i = k.get(0);
        assertEquals(i, 5);

        k.add(8);

        for (int j: k) {
            System.out.println(j);
        }

        k.add(null);
        System.out.println(k);
        assertEquals(null, k.get(2));
    }


    @Test
    public void testMap(){
        Map<Character, Integer> m = new HashMap<>();
        m.put('a', 1 );
        System.out.println(m);
        m.put('a', m.get('a') + 1);
        System.out.println(m);
        assertEquals(2,m.get('a'));
    }

}