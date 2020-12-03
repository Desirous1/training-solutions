package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    public final List<Item> items;

    public Budget(List<Item> items) {
        this.items = new ArrayList<>(items);

    }

    public List<Item> getItemsByMonth(int mounth) {
        if(mounth < 1 || mounth > 12) {
            throw new IllegalArgumentException("Invalid month supplied.");
        }
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if ( item.getMonth() == mounth ) {
                result.add(item);
            }
        }
        return result;
    }
}

   /* public void Budget(Item itemList) {
        items.add(itemList);
    }

    public static void main(String[] args) {
        Budget budget = new Budget();

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++   ) {
            System.out.println("Kérem a termék nevét: ");
            String nev = scanner.nextLine();
            System.out.println("Kérem a hónap számát 1-12: ");
            int honap = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérem a termék árát: ");
            int ar = scanner.nextInt();
            scanner.nextLine();
            budget.Budget(new Item(ar, honap, nev));

        }
        //System.out.println(budget.items.size());

        for (Item oi: budget.items  ) {
            System.out.println(oi.getName() + "\n" + oi.getMonth() + "\n" + oi.getPrice());
        }
    } */
