package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testCreate() {
        User user = new User("zsoltdoczigmail.c@om");
        String name = user.fullName("Zsolt", "Dóczi");

        assertEquals(name,"Zsolt Dóczi");
    }

}
