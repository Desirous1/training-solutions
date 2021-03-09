package comparator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    private List<Employee> employees = Collections.unmodifiableList(Arrays.asList(
            new Employee("John Doe", 180_000, null),
            new Employee("Jane Doe", 200_000, "bbb-123"),
            new Employee("Joe Doe", 100_000, null),
            new Employee("John Smith", 100_000, "aaa-123")));

    private EmployeeService employeeService = new EmployeeService();

    @Test
    public void testSortByName() {
        List<Employee> sorted = employeeService.sortByName(new ArrayList<>(this.employees));
        System.out.println(sorted);
        assertEquals(Arrays.asList("Jane Doe", "Joe Doe", "John Doe", "John Smith"), employeeService.toNames(sorted));
    }

    @Test
    public void testSortBySalaryThanName() {
        List<Employee> sorted = employeeService.sortBySalaryThanName(new ArrayList<>(this.employees));
        System.out.println(sorted);
        assertEquals(Arrays.asList("Joe Doe", "John Smith", "John Doe", "Jane Doe"), employeeService.toNames(sorted));
    }

    @Test
    public void testSortByCardNumberNullFirst() {
        List<Employee> sorted = employeeService.sortByCardNumberNullsFirst(new ArrayList<>(this.employees));
        System.out.println(sorted);
        assertEquals(Arrays.asList("Joe Doe", "John Doe", "John Smith", "Jane Doe"), employeeService.toNames(sorted));
    }

    @Test
    public void testSortByNameReversed() {
        List<Employee> sorted = employeeService.sortByNameReversed(new ArrayList<>(this.employees));
        System.out.println(sorted);
        assertEquals(Arrays.asList("John Smith", "John Doe", "Joe Doe", "Jane Doe"), employeeService.toNames(sorted));
    }

}