package week08d03;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    public void testUnio() {
        StringLists unio = new StringLists();
        System.out.println(unio.stringListsUnion(Arrays.asList("abc"), Arrays.asList("abc") ));
        assertEquals(Arrays.asList("abc"), unio.stringListsUnion(Arrays.asList("abc"), Arrays.asList("abc") ));

        System.out.println(unio.stringListsUnion(Arrays.asList("a","b","c"), Arrays.asList("a","f","b","g","c") ));

    }

}