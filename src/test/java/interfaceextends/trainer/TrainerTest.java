package interfaceextends.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {
        @Test
        public void testCreate(){
            HasName hasName = new Trainer("John Doe", 30);
            HasNameAndAge hasNameAndAge = new Trainer("John Doe", 30);
        }


}