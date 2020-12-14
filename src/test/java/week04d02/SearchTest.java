package week04d02;

import org.junit.jupiter.api.Test;

import java.io.Serial;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    public void testSearch() {
        Search search = new Search();
        assertEquals(Arrays.asList(0,3,5), search.getIndexesOfChar("almafa", 'a'));
    }

}