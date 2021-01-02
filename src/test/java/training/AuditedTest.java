package training;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuditedTest {

    @Test
    public  void testFind() {
        List<Audited> values = new ArrayList<>();
        values.add(new Employee2("John Doe", LocalDateTime.of(2019,1,1,10,0)));
        values.add(new Employee2("Jane Doe", LocalDateTime.of(2019,2,1,10,0)));

        Audited audited = Audited.findLastCreated(values);
        assertEquals("Jane Doe", ( (Employee2) audited).getName());
    }

}