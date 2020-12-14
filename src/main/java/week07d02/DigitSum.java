package week07d02;

import java.util.Scanner;

public class DigitSum {

    public int sumOfDigits(int paraInt) {
        String sum = String.valueOf(paraInt);
        int result = 0;
        for (int i = 0; i < sum.length(); i++) {
            result = result + Integer.parseInt(String.valueOf(sum.charAt(i)));
        }
    return result;
    }

    public static void main(String[] args) {
        DigitSum digitSum = new DigitSum();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(digitSum.sumOfDigits(number));
    }
}
