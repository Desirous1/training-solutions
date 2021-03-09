package streams;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    List<Employee> employees = Arrays.asList(
            new Employee("John Doe"),
            new Employee("Jane Doe"),
            new Employee("Joe Doe"),
            new Employee("John Smith")
    );


    @Test
    public void testCount() {
        assertEquals(0, Stream.empty().count());

        assertEquals(2, Stream.of(new Employee("John Doe"),
                new Employee("Jack Doe")).count());

        Stream<Employee> s = Stream.of(new Employee("John Doe"),
                new Employee("Jack Doe"));
        assertEquals(2, s.count());

        assertEquals(4, employees.stream().count());
    }

    @Test
    public void testMin() {
        Employee employee = employees.stream().min(Comparator.comparing(Employee::getName))
                .get();
        System.out.println(employee.getName());
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    public void testFindFirst() {
        Employee employee = employees.stream().findFirst().get();
        assertEquals("John Doe", employee.getName());
    }

    @Test
    public void testAllMatch() {
        boolean result = employees.stream().allMatch(e -> e.getName().length() > 5);
        assertEquals(true, result);

        assertEquals(false, employees.stream().allMatch(e -> e.getName().startsWith("a")));
    }

    @Test
    public void testForEach() {
        employees.stream().forEach(e -> e.setName(e.getName().toUpperCase()));
        employees.stream().forEach(System.out::println);
        assertEquals("JOHN DOE", employees.get(0).getName());
    }

}