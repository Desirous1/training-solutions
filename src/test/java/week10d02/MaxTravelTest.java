package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void testGetMaxPassenger() {
        assertEquals(12,new MaxTravel().getMaxPassenger(List.of(12,12,12,3,0,0,3)));
    }
}