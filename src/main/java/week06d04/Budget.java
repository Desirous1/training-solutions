package week06d04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Budget {

    List<Item> items = new ArrayList<>();

    public void Budget(Item itemList) {
        items.add(itemList);
    }

    public static void main(String[] args) {
        Budget budget = new Budget();

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++   ) {
            System.out.println("Kérem a nevét: ");
            String nev = scanner.nextLine();
            System.out.println("Kérem a hónap számát 1-12: ");
            int honap = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérek egy összeget: ");
            int ar = scanner.nextInt();
            scanner.nextLine();
            budget.Budget(new Item(ar, honap, nev));

        }
        //System.out.println(budget.items.size());

        for (Item oi: budget.items  ) {
            System.out.println(oi.getName() + "\n" + oi.getMonth() + "\n" + oi.getPrice());
        }
    }







}
