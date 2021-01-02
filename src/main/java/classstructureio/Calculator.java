package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek 2 számot:");
        System.out.println("Az első? ");
        int first = scanner.nextInt();
        System.out.println();
        System.out.println("A második? ");
        int second = scanner.nextInt();
        System.out.println();
        System.out.println(first+ " + " + second + "\n" + (first + second));
    }
}
