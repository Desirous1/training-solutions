package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> paraList) {
        int elozo = Integer.MIN_VALUE;
        for (Integer oi: paraList ) {
             if ( elozo > oi ) {
                return false;
             }
             elozo = oi;
        }
        return true;
    }
}
