package trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    @Test
    public void testList() {
        List<String> l = new ArrayList<>();
        l.add("John");
        l.add("Jack");
        assertEquals( Arrays.asList("John","Jack"), l );
        Collection<String> c = l;
        c.add("Jane");
    }

}
