package training;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    @Test
    public void testTraChangeValues() {
        int originalYearOfBirth = 1980;
        String originalName = "Jack";
        List<String> originalCourses = new ArrayList<>();
        new EmployeeService().tryChangeValues(originalYearOfBirth, originalName, originalCourses);

        assertEquals(1980, originalYearOfBirth);
    }
}