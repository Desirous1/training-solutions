package objectclass.trainer;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testCreate() {
        // Object obj = "";
        // Object obj = new Integer(5);
        // Object obj = new Course("efde");
        // Object obj = new Trainer(további paraméterek);
            // Object[] array = new Object[2];
            // array[0] = "erdrtr";
            // array[1] = new Trainer(megfelelő paraméterek)

        System.out.println(new Trainer("John Doe", 30, Collections.emptyList()));
    }

}