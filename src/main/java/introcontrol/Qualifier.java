package introcontrol;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy egész számot:");
        int szam = scanner.nextInt();
        System.out.println();
        if (szam == 100) {
            System.out.println(szam);
        }
        if (szam > 100) {
            System.out.println("nagyobb");
        }
        if (szam < 100) {
            System.out.println("kisebb");
        }
    }
}
