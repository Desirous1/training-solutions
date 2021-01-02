package interfacemethods;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testCreatedAfter(){
        Account account = new Account(LocalDateTime.of(2021,01,02,10,0));
        boolean result = account.createdAfter(LocalDateTime.of(2021,01,02,9,0));
        System.out.println(result);
        assertTrue(result);
    }

}