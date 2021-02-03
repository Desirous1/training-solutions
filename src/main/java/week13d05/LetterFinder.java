package week13d05;

import java.util.*;

public class LetterFinder {

    public int letterCounter(String word) {

        Set<Character> numberOfCharacter = new HashSet<>();
        String worldLowerCase = word.toLowerCase();
        for (int i = 0; i < worldLowerCase.length(); i++) {
            int number = worldLowerCase.charAt(i);
            if (number >= 'a' && number <= 'z') {
                    numberOfCharacter.add(worldLowerCase.charAt(i));
             }
        }
        return numberOfCharacter.size();
    }

    public static void main(String[] args) {
        LetterFinder letterFinder = new LetterFinder();
        System.out.println(letterFinder.letterCounter("Programozási rémálom a Java utcában"));
    }
}