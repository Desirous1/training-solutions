package lambdas;

import java.util.List;

public class EmployeeService {

   // public Employee findFirst(List<Employee> employees, String name){
    public Employee findFirst(List<Employee> employees, Condition condition){
        for(Employee employee: employees) {
     //       if(employee.getName().equals(name)) {
            if(condition.test(employee)) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Employe not found");
    }
}
