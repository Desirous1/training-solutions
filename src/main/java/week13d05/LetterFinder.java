package week13d05;

import java.util.*;

public class LetterFinder {

    public int letterCounter(String word) {

        Set<Character> characterFromWord = new HashSet<>();
        for (Character aChar : word.toLowerCase().toCharArray()) {
            if (aChar >= 'a' && aChar <= 'z') {
                characterFromWord.add(aChar);
            }
        }
        return characterFromWord.size();
    }

    public static void main(String[] args) {
        LetterFinder letterFinder = new LetterFinder();
        System.out.println(letterFinder.letterCounter("Programozási rémálom a Java utcában"));
    }
}