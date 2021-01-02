package training.methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerBuilderTest {
    @Test

    public  void build() {
        //TrainerBuilder trainerBuilder = new TrainerBuilder().withName("John Doe").withAge(30);
        Trainer trainer = new TrainerBuilder()
                .withName("John Doe")
                .withAge(30)
                .build();

        //Trainer trainer = trainerBuilder.build();

        assertEquals(trainer.getName(), "John Doe");
    }
}