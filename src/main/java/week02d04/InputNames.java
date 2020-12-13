package week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];

        for (int i=0; i < name.length ; i++) {
            name[i] = scanner.nextLine();
        }

        for (int i=0 ; i < name.length; i++) {
            System.out.println( i+1 + ". elem: " + name[i]   ) ;
        }


    }
}
