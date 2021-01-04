package week10d01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevation() {
        assertEquals(13.0, new Hiking().getPlusElevation(List.of(10.0, 20.0, 15.0, 18.0)));
    }

    @Test
    void getPlusElevation2() {
        assertEquals(0.0, new Hiking().getPlusElevation(List.of(10.0)));
    }

    @Test
    void getPlusElevation3() {
        assertEquals(0.0, new Hiking().getPlusElevation(List.of()));
    }

    @Test
    void getPlusElevation4() {
        assertThrows(IllegalArgumentException.class, () -> new Hiking().getPlusElevation(null));
    }
}
