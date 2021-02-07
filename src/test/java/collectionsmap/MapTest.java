package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    @Test
    public void testMap() {
        Map<String, String> codes = new HashMap<>();  // valamilyen sorrendben rakja be az elemeket
        //Map<String, String> codes = new LinkedHashMap<>(); // hozzáadás szerinti sorrendben rakja be az elemeket
        assertEquals(true, codes.isEmpty());

        codes.put("200", "OK");
        codes.put("404", "Not found");
        System.out.println("codes: " + codes);

        Map<String, String> expected = new HashMap<>();
        expected.put("200", "OK");
        expected.put("404", "Not found");
        System.out.println("expected: " + expected);
        assertEquals(expected, codes);

        codes.put("404", "Not Found");
        System.out.println("új értékkel codes: " + codes);

        String s = codes.get("404");
        assertEquals("Not Found", s);

        codes.put("304", "Not modify");
        System.out.println(codes);

        codes.remove("304");
        System.out.println(codes);
        assertEquals(false, codes.containsKey("304"));
        System.out.println(codes);
        assertEquals(true, codes.containsValue("OK"));


        System.out.println(codes.keySet());
        System.out.println(codes.values());
        System.out.println(codes.entrySet());
        for (Map.Entry entries : codes.entrySet()) {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());
        }
    }

    @Test
    public void testTrainersMap() {
        List<Trainer> trainers = Arrays.asList(
                new Trainer(1L, "John"),
                new Trainer(2L, "Jack"),
                new Trainer(3L, "Jane"),
                new Trainer(4L, "Joe")
        );

        Map<Long, Trainer> m = new HashMap<>() ;
        for (Trainer t: trainers){
            m.put(t.getId(), t);
        }
        System.out.println(m);

        Trainer t = m.get(3L);
        assertEquals("Jane", t.getName());
    }
}