package week06d04;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Budget budget = new Budget(Arrays.asList(
                new Item("Fogkefe", 2_300, 3),
                new Item("Kenyér", 458, 3),
                new Item("Zabkása", 150, 6),
                new Item("Cipő", 12500, 9)
        ));

        System.out.println(budget.getItemsByMonth(13));
        System.out.println(budget.getItemsByMonth(3));
    }
}
