package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy egész számot?: ");
        int number = scanner.nextInt();
        System.out.println();
        /*
        if(number%3==0) {
            System.out.println("A szám osztható 3-al.");
        } else {
            System.out.println("Csak maradékkal osztható");
        } */
        System.out.println(number % 3 ==0 ? "osztható 3-al maradék nélkül" : "maradék nélkül nem osztható 3-al");
    }
}
