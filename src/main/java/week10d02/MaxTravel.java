package week10d02;

import java.util.List;

public class MaxTravel {

    public int getMaxPassenger(List<Integer> paraList) {
        int[] passengersNum = new int[30];
        int maxIndex = 0;
        int maxValue = 0;

        for (int oi : paraList) {
            passengersNum[oi]++;
        }
        for (int i = 0; i < passengersNum.length; i++) {
            if (passengersNum[i] > maxValue) {
                maxValue = passengersNum[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
