/*
Készíts egy Indexer osztályt, melynek van egy public Map<Character, List<String>> index(List<String> names) metódusa.
A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből (minden kezdőbetűt társítsunk az összes névvel,
mely ezzel a betűvel kezdődik). Példa:
System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}
 */
package week14d01;

import java.text.Collator;
import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> result = new HashMap<>();

        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));

        System.out.println(names);
        //Iterator<String> namesString = names.iterator();
        //while (namesString.hasNext()) {
        //  String j = namesString.next();
        for (String name : names) {
            //for (int i = 0; i < names.size(); i++) {
            //Character firstChar = oi.charAt(0);
            char init = name.charAt(0);
            if (!result.containsKey(init)) {
                result.put(init, new ArrayList<>());
            }
            result.get(init).add(name);
            //Character firstChar = names.get(i).charAt(0);
            //result.put(firstChar, List.of(names.get(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Öröm", "Odon", "Lujza", "Abraham", "Magdolna", "Ábel", "Ödön")));
    }
}
