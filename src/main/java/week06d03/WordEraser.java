package week06d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {

        Scanner firstW = new Scanner(words);
        Scanner secondW = new Scanner(word);

        List<String> listW = new ArrayList<>();

        StringBuilder ret = new StringBuilder("");

        // outer kellene, de nem tartok ott
        while (firstW.hasNext()) {
            //listW.add(firstW.next());
            while (secondW.hasNext()) {
                if (!firstW.next().equals(secondW.next())) {
                    ret.append(firstW.next());
                }
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        WordEraser wordEraser = new WordEraser();

        //wordEraser.eraseWord("Körte Alma Meggy", "Alma Meggy");
        System.out.println(wordEraser.eraseWord("Körte Alma Meggy", "Alma Meggy"));

    }


}


