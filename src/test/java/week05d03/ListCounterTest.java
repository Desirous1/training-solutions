package week05d03;

//import org.junit.jupiter.api.AssertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;



public class ListCounterTest {


    @Test
    public  void chartSeek() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("Alma","Kenyér","körte", "ananász");
        System.out.println(listCounter.chartSeek(testList));

       // assertEquals(   2, listCounter.startsWithACounte(testList));


    }




}
