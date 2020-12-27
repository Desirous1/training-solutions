package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    public void testLottery() {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers());
    }

}