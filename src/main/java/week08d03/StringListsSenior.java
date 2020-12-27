package week08d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringListsSenior {

    public List<String> shortestWords(List<String> words) {
        int lengthString = Integer.MAX_VALUE;
        List<String> uj = new ArrayList<>();

        for (String oi : words) {
            if (oi.length() < lengthString) {
                lengthString = oi.length();
            }
        }

        for (String oi : words) {
            if (oi.length() == lengthString) {
                uj.add(oi);
            }
        }
        return uj;
    }

    public static void main(String[] args) {
        StringListsSenior str = new StringListsSenior();
        System.out.println(str.shortestWords(Arrays.asList("ss", "eee", "qq", "ztrrr")));
    }
}
