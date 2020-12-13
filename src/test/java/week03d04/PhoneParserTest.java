package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {

    @Test
    void testCreate() {
        //given előkészítjük
        PhoneParser parser = new PhoneParser();
        //when meghívjuk a tesztelendő metódust
        Phone phone = parser.parsePhone("12-4988374");
        // then ellenőrizzük
//        System.out.println(phone.getPrefix());
//        System.out.println(phone.getNumber());
//        System.out.println(phone);
        assertEquals("12", phone.getPrefix());
        assertEquals("4988374", phone.getNumber());

    }


}