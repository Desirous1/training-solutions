package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SultanTest {

    @Test
    public void testSultan() {
        Sultan sult = new Sultan();
        int result=0;
        for ( int i= 1; i <= 100; i++) {
            if (100 % i == 0) {
                result++;
            }
        }
        boolean openDoor =  result % 2 != 0 ;
        sult.changeDoors();
        System.out.println("openDoor: " + openDoor + " Result: " + result);
        System.out.println("getLastDoor: " + sult.getLastDoor().isOpen());

        assertEquals(openDoor, sult.getLastDoor().isOpen() );

    }
}