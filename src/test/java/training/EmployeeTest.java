package training;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testEmployeeImmutable() {
        List<String > courses = new ArrayList<>();
        courses .add(("Jaava"));
        courses.add("Python");
        Employee employee = new Employee("John Doe", 1970,courses );


        employee.getCourses().add("C#");

        assertEquals(2, employee.getCourses().size());
    }

}