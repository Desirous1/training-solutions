package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> language = new ArrayList<>();
        // Languages languages = new Languages();

        language.add("Java");
        language.add("Python");
        language.add("JavaScript");

        for ( String oi: language  ) {
            if ( oi.length() > 5) {
                System.out.println(oi);
            }
        }
    }
}
