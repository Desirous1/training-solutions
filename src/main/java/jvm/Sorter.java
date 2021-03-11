package jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorter {
    private int size;

    public List<Integer> createListAndSort(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i =0; i<size; i++) {
            list.add(random.nextInt());
        }
        Collections.sort(list);
        return list;
    }
}
