package training.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    public void simplestCase() {

        //Given
        int number = 1;

        //When
        long actual = new FactorialCalculator().getFactorial(number);

        //Then
        assertEquals(actual, 1L);
    }


    @Test
    public void greaterNumber() {
        int number = 4;
        long actual = new FactorialCalculator().getFactorial(number);
        assertEquals(actual, 24L);
    }
}