package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    public List<Employee> sortByName(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortBySalaryThanName(List<Employee> employees) {
        employees.sort(Comparator.comparingInt(Employee::getSalary)
        .thenComparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortByCardNumberNullsFirst(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getCardNumber,
                Comparator.nullsFirst(Comparator.naturalOrder()))
        .thenComparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortByNameReversed(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName).reversed());
        // employees.sort(Comparator.comparing(Employee::getName, Comparator.reverseOrder()));  // Ez is jó natural order visszafelé
        return employees;
    }

    public List<String> toNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee: employees) {
            names.add(employee.getName());
        }
        return names;
    }

}
