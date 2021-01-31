package genericsusage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGenericsUsage {

    @Test
    public void testGenericsUsage() {
        List<String> l = new ArrayList();
        l.add("John Doe");
        l.add("Jahn Doe");

        Object s = l.get(0);
        assertEquals( s, "John Doe");

        List<String> l2 = new ArrayList<>();
        Collection<String> l3 = 12;
    }

}
