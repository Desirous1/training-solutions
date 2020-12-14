package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test
    public void testCreate() {
        NumberList numberList = new NumberList();
        assertEquals(true, numberList.isIncreasing(Arrays.asList(1, 2, 3, 4)));
    }
}