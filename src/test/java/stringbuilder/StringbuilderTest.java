package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringbuilderTest {

    @Test
    public void testAppend(){
        StringBuilder sb = new StringBuilder("John");
            // new StringBuilder(15);
        for (int i = 0; i < 3; i++) {
            sb.append(" Doe");
        }
        String s = sb.toString();
        assertEquals("John Doe Doe Doe", s);

        sb.insert(1,"xxx");
        System.out.println(sb);
        assertEquals(sb.toString(), "Jxxxohn Doe Doe Doe");


        sb.delete(1, 3);
        System.out.println(sb);
        assertEquals(sb.toString(), "Jxohn Doe Doe Doe");

        System.out.println(sb.reverse());
    }
}
