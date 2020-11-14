package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem írd be a neved? ");
        client.name = scanner.nextLine();

        System.out.println("Születési éved? ");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lakcímed? ");
        client.address = scanner.nextLine();

        System.out.println();
        System.out.println("Az allábbi adatokat adtad meg: ");
        System.out.println("Név:            " + client.name);
        System.out.println("Születési éved: " + client.year);

        System.out.println("Lakcímed:       " + client.address);
    }
}
