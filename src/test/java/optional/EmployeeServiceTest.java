package optional;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    public void testFindFirst() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );
        Optional<Employee> result = new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("Jane"));
        assertEquals(true, result.isPresent());
        assertEquals(result.get().getName(), "Jane Doe");
    }


    @Test //(expected = IllegalArgumentException.class)
    public void testNotFound()  {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );
        new EmployeeService().findFirst(employees,
            employee -> employee.getName().startsWith("Joe")).orElseThrow(() ->new IllegalArgumentException("Not found"));
    }


    @Test
    public void testDefault()  {
        List<Employee> employees =
                Arrays.asList(
                        new Employee("John Doe"),
                        new Employee("Jane Doe"),
                        new Employee("Jack Doe")
                );
        Employee result = new EmployeeService().findFirst(employees,
            employee -> employee.getName().startsWith("Joe"))
                //.orElse(new Employee("Anonymus"));              /Ez is jó
                 .orElseGet(() ->new Employee("Anonymus"));
        System.out.println(employees);
        System.out.println(result);
        assertEquals("Anonymus",result.getName());
    }



}