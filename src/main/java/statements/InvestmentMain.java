package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Kérem a befektetett összeget?: ");
        int amount = scanner.nextInt();
        System.out.println("Kamatláb?:");
        int interestRate = scanner.nextInt();
        System.out.println();

        Investment invest = new Investment(amount, interestRate);

        System.out.println("Tőke: " + invest.getFund());
        System.out.println("Kamatláb: " + interestRate);
        System.out.println("Hozam 50 napra: " + invest.getYield(50));
        System.out.println("Kivett összeg 50 nap után: " + invest.close(50));
        System.out.println("Kivett összeg 80 nap után: " + invest.close(80));


    }
}
