package architecture;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

public class EmployeesMain {

    public static void main(String[] args) {

        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        EmployeesDao employeesDao = new EmployeesDao(dataSource);
        employeesDao.createEmployee("John Doe");
        List<String> names = employeesDao.listEmployeeNames();
        System.out.println(names);

        String name = employeesDao.findEmployeeNameById(4L);
        System.out.println(name);

    }


}
