package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random rnd = new Random(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot 1 és 100 között");
        int nextInt = rnd.nextInt(100);

        for (int i = 0; i < 6; i++) {
            int paraNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Megadott szám: " + paraNumber + " Véletlen szám: " + nextInt);
            if( paraNumber > 100) {
                throw new IllegalArgumentException("Nagyobb 100-nál a megadott szám");
            }
            if (paraNumber < nextInt) {
                System.out.println("Kisebb mint a véletlen szám");
            } else if (paraNumber > nextInt) {
                System.out.println("Nagyobb mint a véletlen szám");
            } else {
                System.out.println("Egyenlő a két szám");
                break;
            }
        }
    }
}