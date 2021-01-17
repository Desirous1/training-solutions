package week10d05;

import java.util.Arrays;

public class Calculator {

    public void findMinSum(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("Less then 4 items in array!");
        }
//            Arrays.sort(arr);
//            int sum = arr[0] + arr[1] + arr[2] + arr[3];
//            String items = arr[0] + "+" + arr[1] + "+" + arr[2] + "+" + arr[3] + "=";
//            System.out.println(items + sum);
        //Saját rendezés
        for (int i = arr.length; i > -1; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int oi = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = oi;
                }
            }
        }
        for (int o = 0; o < arr.length; o++) {
            System.out.println(arr[o]);
        }
        int sum = arr[0] + arr[1] + arr[2] + arr[3];
        String items = arr[0] + "+" + arr[1] + "+" + arr[2] + "+" + arr[3] + "=";
        System.out.println(items + sum);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.findMinSum(new int[]{10, 9, 2, 5, 8, 1});
    }
}
