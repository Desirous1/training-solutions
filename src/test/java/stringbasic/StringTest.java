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
        System.out.print("    Hexo   World    ".trim().replace("x", "ll").substring(2, 10));
        System.out.println();

        String[] a1 = "Első,Második,Harmadik".split(",");
        for (String qq: a1 ) {
            System.out.println(qq);
        }
    }


}
