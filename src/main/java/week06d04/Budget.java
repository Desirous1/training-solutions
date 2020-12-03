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

        String nev = scanner.nextLine();
        int honap = scanner.nextInt();
        int ar = scanner.nextInt();
        scanner.nextLine();
        budget.Budget(new Item(ar, honap, nev)); ;
        System.out.println(budget.items.size());
        System.out.println( toString());
    }







}
