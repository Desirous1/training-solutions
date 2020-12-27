package week08d02;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers() {

        List<Integer> lotteryNumbers = new ArrayList<>();
        Random rnd = new Random();
        while (lotteryNumbers.size() != 5) {
            int nextInt = rnd.nextInt(90) + 1;
            if (!lotteryNumbers.contains(nextInt)) {
                lotteryNumbers.add(nextInt);
            }
        }
        return lotteryNumbers;
    }
}
