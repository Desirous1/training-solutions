package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    public void testNameChanger() {
        NameChanger nameChanger = new NameChanger("Dóczi Zsolt");
        System.out.println(nameChanger);
        assertEquals("Csányi Zsolt", nameChanger.changeFirstName("Csányi"));
        System.out.println(nameChanger.changeFirstName("Csányi"));
    }
}