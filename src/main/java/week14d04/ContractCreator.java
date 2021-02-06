/*
Legyen egy szerződés (Contract) osztály, melynek van egy String client és egy List<Integer> monthlyPrices attribútuma.
Az előbbi a szerződő neve, a második pedig a havonta fizetendő összeg.
Legyen egy ContractCreator osztály, melynek van egy ContractCreator(String client, List<Integer> monthlyPrices) konstruktora,
mely létrehoz egy szerződéssablont, a paraméterként megadott adatokkal, melyet összesen EGY attribútumban tárolj!
Majd írj egy create(String name) metódust, mely a sablon alapján létrehoz egy új szerződést, de a nevet kicseréli a
paraméterként megadott névre.
 */
package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {
    private Contract template;

    public ContractCreator(String name, List<Integer> monthlyPrices) {
        template = new Contract(name, monthlyPrices);
    }
    public Contract create(String client) {
        return new Contract(client, new ArrayList<>(template.getMonthlyPrices()));
    }

    public static void main(String[] args) {
        ContractCreator creator = new ContractCreator("minta János", new ArrayList<>(List.of(10, 10, 10)));
        Contract contract1 = creator.create("John Doe");
        Contract contract2 = creator.create("Jack Doe");

        System.out.println(contract1);
        System.out.println(contract2);

        contract1.getMonthlyPrices().set(1, 20) ;
        System.out.println(contract1);
        System.out.println(contract2);
    }


}
