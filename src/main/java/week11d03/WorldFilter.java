package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WorldFilter {

    private List<String> wordsList = new ArrayList<>();

    public List<String> wordsWithCar(List<String> words, char c) {
        for (String oi : words) {
            oi = oi.toLowerCase();
            if (oi.contains(Character.toString(c))) {
                wordsList.add(oi);
            }
        }
        return wordsList;
    }

    public static void main(String[] args) {

        System.out.println(new WorldFilter().wordsWithCar(List.of("Alma", "Citrom", "Narancs"), 'c'));
    }
}
