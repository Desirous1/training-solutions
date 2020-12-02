package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int szum = 0;

        for (int i = 1; i<= 5; i++) {
            System.out.println(i + ". kérek egy egész számot:");
            int szam = scanner.nextInt();
            szum = szum + szam;
            System.out.println(szum);
        }


    }
}
