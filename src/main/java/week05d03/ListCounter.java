package week05d03;

import java.util.Arrays;
import java.util.List;

public class ListCounter {

    public int chartSeek(List<String> paraList) {
        int counter = 0;
        for (String i : paraList) {
            if (i.startsWith( "A" )) {
                counter++;
            }
        }
        return counter;
    }
}