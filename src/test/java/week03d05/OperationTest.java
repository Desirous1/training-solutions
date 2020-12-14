package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    public void testResult() {

        Operation operation = new Operation(68, 12);
        assertEquals(80, operation.getResult());

    }

}