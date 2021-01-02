package abstractclass.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class TrainerTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("John Doe", 30, Arrays.asList(new Course("Course1")) ) ;
        trainer.work();
    }

}