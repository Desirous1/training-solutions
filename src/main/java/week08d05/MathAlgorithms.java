package week08d05;

import java.util.Scanner;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) { // legnagyobb közös oszto vissza
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Nulla és negatív szám nem lehet");
        }
        int c = Integer.MAX_VALUE;
        int minNu = Math.min(a, b);
        int maxNu = Math.max(a, b);
        while (c > 0) {
            c = maxNu % minNu;
            if (c == 0) {
                break;
            }
            maxNu = minNu;
            minNu = c;
        }
        return minNu;
    }

//    public static void main(String[] args) {
//        MathAlgorithms mat = new MathAlgorithms() ;
//        System.out.println(mat.greatestCommonDivisor(84,18));
//    }
}
