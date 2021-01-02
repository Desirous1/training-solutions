package polymorphism.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TrainerTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        // assertTrue(trainer, instanceOf(Trainer.class) );
    }

    @Test
    public void testConvert() {
        Trainer trainer = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        Human human = trainer;
        Object object = trainer;
        HasName hasName = trainer;
    }

    @Test
    public void testExplicitConvert() {
        Object object = new Trainer("John Doe", Arrays.asList(new Course("Course1")));
        Trainer trainer = (Trainer) object;
    }

    @Test
    public void testExplicitConvertCannotWork() {
        //expectedException.expect(ClassCastExpection.class);
        Human human = new Human("John Doe");
        Trainer trainer = (Trainer) human;
    }

}