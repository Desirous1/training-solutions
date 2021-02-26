package lambdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
        Employee result = new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("Jane"));
        assertEquals("Jane Doe", result.getName());

    }

}
/*
                new Condition() {
                    @Override
                    public boolean test(Employee employee) {
                        return employee.getName().startsWith("Jane");
                    }
                });
                */