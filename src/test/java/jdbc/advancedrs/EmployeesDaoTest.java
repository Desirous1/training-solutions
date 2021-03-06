package jdbc.advancedrs;

import jdbc.advancedrs.EmployeesDao;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @BeforeEach
    public void init() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");

        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();
        employeesDao = new EmployeesDao(dataSource);
    }

    @Test
    public void testInsert(){
        employeesDao.createEmployee("John Doe");
        assertEquals(Arrays.asList("John Doe"), employeesDao.listEmployeeNames());
    }

    @Test
    public void testById() {
        long id = employeesDao.createEmployee("Jack Doe");
        System.out.println(id);
        id = employeesDao.createEmployee("Jane Doe");
        System.out.println(id);
        String name = employeesDao.findEmployeeNameById(id);
        assertEquals("Jane Doe", name);

        System.out.println(employeesDao.listEmployeeNames());
    }

    @Test
    public void testCreateEmployees() {
        employeesDao.createEmployees(Arrays.asList("Jack Doe", "Jane Doe","Joe Doe" ));
        List<String> names = employeesDao.listEmployeeNames();
        assertEquals(Arrays.asList("Jack Doe", "Jane Doe","Joe Doe" ), names);
    }

    @Test
    public void createEmployeesRollback(){
        employeesDao.createEmployees(Arrays.asList("Jack Doe", "Jane Doe","xJoe Doe" ));
        List<String> names = employeesDao.listEmployeeNames();
        assertEquals(Collections.emptyList(), names);
    }

    @Test
    public void testOddNames() {
        employeesDao.createEmployees(Arrays.asList("Jack Doe", "Jane Doe", "Joe Doe"));
        List<String> names = employeesDao.listOddEmployeeName();
        assertEquals(Arrays.asList("Jack Doe", "Joe Doe" ), names);
    }

    @Test
    public void testUpdateName() {
        employeesDao.createEmployees(Arrays.asList("Jack Doe", "Jane Doe", "Joe Doe"));
        employeesDao.updateNames();
        List<String> names = employeesDao.listEmployeeNames();
        assertEquals(Arrays.asList("Mr. Jack Doe", "Jane Doe","Mr. Joe Doe" ), names);
    }

}