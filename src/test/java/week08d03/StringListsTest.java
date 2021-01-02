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

        System.out.println(unio.stringListsUnion(Arrays.asList("b","c"), Arrays.asList("c","a","f","b","g","c") ));
        //assertEquals(Arrays.asList("b, c, a, f, g"),unio.stringListsUnion(Arrays.asList("b","c"), Arrays.asList("c","a","f","b","g","c") ) );
    }

}