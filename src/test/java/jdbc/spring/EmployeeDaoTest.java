package jdbc.spring;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)

public class EmployeeDaoTest {

    @Autowired
    private Flyway flyway;

    @Autowired
    private EmployeeDao employeeDao;

    @BeforeEach
    public void init() {
        flyway.clean();
        flyway.migrate();
    }

    @Test
    public void testCreateThanList() {
        employeeDao.createEmployee("John Doe");
        List<String> employees = employeeDao.listEmployesNames();

        assertEquals(Arrays.asList("John Doe"), employees);
    }

    @Test
    public void testThanFind() {
        long id = employeeDao.createEmployee("John Doe");
        System.out.println(id);
        String name = employeeDao.findEmployeeNameById(id);
        assertEquals("John Doe", name);
    }

}