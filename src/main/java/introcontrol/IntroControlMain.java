package introcontrol;

import java.util.Scanner;

public class IntroControlMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntroControl introControl = new IntroControl();

        System.out.println("Kérek egy egész számot: ");
        int numberGet = scanner.nextInt();
        scanner.nextLine();
        System.out.println(introControl.describeNumber(numberGet));
        //System.out.println();
        System.out.println(introControl.subtractTenIfGreaterThanTen(numberGet));
        //System.out.println();
        System.out.println("Kérem a keresztneved: ");
        String neved = scanner.nextLine();
        System.out.println(introControl.greetingToJoe(neved));

        System.out.println("Kérem a havi eladás értékét?");
        int saleVol = scanner.nextInt();
        scanner.nextLine();
        if ( saleVol > 1000_000) {
            System.out.println(introControl.calculateBonus(saleVol) + " $ a jutalékod.");
        } else { System.out.println("1000.000,- alatt nincs jutalék"); }








    }
}
