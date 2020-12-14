package week04d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        System.out.println("Kérek egy karaktersorozatot: ");
        Scanner scanner = new Scanner(System.in);
        Search search = new Search();
        String paraString = scanner.nextLine();
        String paraChar = scanner.next();
        System.out.println(search.getIndexesOfChar(paraString, paraChar.charAt(0)));
    }

    public List<Integer> getIndexesOfChar(String paraTxt, char paraChar) {
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < paraTxt.length(); i++) {
            if (paraTxt.charAt(i) == paraChar) {
                indexList.add(i);
            }
        }
        return indexList;
    }


}
