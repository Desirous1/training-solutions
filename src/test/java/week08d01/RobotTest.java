package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    public void testRobot() {

        Robot robot = new Robot();
        assertEquals(new Cord(-3,2), robot.move("lJbbbbFfffL"));
        //System.out.println( robot.move("lJbbbbFfffL"));
    }
}