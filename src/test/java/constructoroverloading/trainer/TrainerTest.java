package constructoroverloading.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("John Doe");
        assertEquals(trainer.getName(), "John Doe");
        assertEquals(trainer.getAge(), 20);
    }

}