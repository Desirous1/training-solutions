package training.proba;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProbaTest {

    @Test
    void feltoltom() {
        Proba pro = new Proba();
        //System.out.println(feltoltom());
        assertEquals(Arrays.asList(12,2,1,0), pro.feltoltom());
    }
}