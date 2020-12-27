package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    public void testNu() {
        try {
            MathAlgorithms mts = new MathAlgorithms();
            assertEquals(6, mts.greatestCommonDivisor(0, 18));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}