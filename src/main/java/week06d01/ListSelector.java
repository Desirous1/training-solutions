package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {

    public String buildFull(List<String> paraList) {

        StringBuilder buildFinal = new StringBuilder("");

        if (paraList == null) {
            throw new IllegalArgumentException(("Null parameter not accepted"));
        }

        if (paraList.size() != 0) {
            buildFinal.append("[");
            for (int i = 0; i < paraList.size(); i = i + 2) {
                buildFinal.append(paraList.get(i));
            }
            buildFinal.append("]");
        }
    return null;
    }

    public static void main(String[] args) {
        ListSelector listSelector = new ListSelector();
        Arrays.asList();
        //System.out.println(listSelector.buildFull((new ArrayList<>("string"))));
    }
}