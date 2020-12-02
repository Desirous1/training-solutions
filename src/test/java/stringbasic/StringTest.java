package stringbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    public void testEquals() {
        String s = "John Doe";
        s = s.toUpperCase();
        assertEquals("JOHN DOE", s);
    }
    @Test
    public void testEquals2(){
        assertEquals("Value12", "Value"+ 1 +2);

    }


}
