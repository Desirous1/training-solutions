package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az előadó nevét: ");
        song.band = scanner.nextLine();
        System.out.println("Kérem a zeneszám címét: ");
        song.title = scanner.nextLine();
        System.out.println("Kérem a szám hosszát (percben): ");
        song.lenght = scanner.nextInt();
        scanner.nextLine();
        System.out.println(song.band + " - " + song.title + " (" + song.lenght + " perc)!");
        
    }
}
