package algorithmsfilter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltersTest {
    @Test
    void testFilterByName() {
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1970));
        trainers.add(new Trainer("John Smith", 1970));

        List<Trainer> filteredTrainers = new Filters().filterByName(trainers,"John");
        System.out.println(filteredTrainers);

        assertEquals(2, filteredTrainers.size());
        assertEquals("John Doe", filteredTrainers.get(0).getName());
        assertEquals("John Smith", filteredTrainers.get(1).getName());


    }

}