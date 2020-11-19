package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a felhasználó nevet?: ");
        String usName = scanner.nextLine();

        System.out.println("Kérem az email címet?: ");
        String userMail = scanner.nextLine();

        System.out.println("Kérem a password-öt?: ");
        String userPass1 = scanner.nextLine();
        System.out.println("Password még 1x?: ");
        String userPass2 = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(usName) ? "Név rendben" : "Név helytelen");
        System.out.println(userValidator.isValidEmail(userMail) ? "Mail rendben" : "Mail nem jó");
        System.out.println(userValidator.isValidPassword(userPass1, userPass2) ? "Pass OK" : "Pass Wrong");


    }

}
