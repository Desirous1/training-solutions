package week06d03;

import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {

        Scanner firstW = new Scanner(words);
        StringBuilder ret = new StringBuilder();

        while (firstW.hasNext()) {
            String a = firstW.next();
                if (!word.equals(a)) {                           //firstW.next().equals(word)) {
                    ret.append(a + " ");
            }
        }
        return ret.toString().trim();
    }

    public static void main(String[] args) {
        WordEraser wordEraser = new WordEraser();
        // String tr = wordEraser.eraseWord("Alma Körte Meggy Cseresznye", "Meggy");
        System.out.println(wordEraser.eraseWord("Alma Körte Meggy Cseresznye", "Meggy"));
        // System.out.println(tr);
    }
}


