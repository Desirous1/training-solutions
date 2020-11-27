package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void testCreate() {
        User user = new User("zsoltdoczigmail.com");
        String name = user.fullName("Zsolt", "Dóczi");

        assertEquals(name, "ZsoltDóczi"); // csak azért írtam egybe, hogy hibás legyen a teszt



    }

}
