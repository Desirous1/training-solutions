package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("11702021-40030055-00000000","Don Jo", 500000);

        BankAccount anothBankAccount = new BankAccount("13250040-01020101-51100005","Kiss István",0);


        System.out.println(bankAccount.getInfo());
        System.out.println(anothBankAccount.getInfo());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Utalás adatai: ");
        System.out.println("Terhelendő bankszámla száma?: ");
        String sender = scanner.nextLine();
        System.out.println("Mekkora összeget utal?: ");
        int sederFt = scanner.nextInt();
        System.out.println();

        if(sender.equals(bankAccount.getAccountNumber())) {
            bankAccount.withdraw(sederFt);
            anothBankAccount.deposit(sederFt);
            System.out.println(bankAccount.getInfo());
            System.out.println(anothBankAccount.getInfo());
        }

        if(sender.equals(anothBankAccount.getAccountNumber())) {
            anothBankAccount.withdraw(sederFt);
            bankAccount.deposit(sederFt);
            System.out.println(bankAccount.getInfo());
            System.out.println(anothBankAccount.getInfo());
        }







    }
}
