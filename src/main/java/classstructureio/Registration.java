package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg a nevét? ");
        String nev = scanner.nextLine();
        System.out.println("Kérem adja meg az email címét? ");
        String mailCim = scanner.nextLine();

        System.out.println("Az alábbi adatokkal regisztrált:");
        System.out.println("Neve: " + nev + " , E-Mail címe: " + mailCim);

    }
}
