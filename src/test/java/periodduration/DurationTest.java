package periodduration;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DurationTest {

    @Test
    public void testDuration() {
        Duration duration = Duration.ofHours(2);
        System.out.println(duration);
        assertEquals("PT2H", duration.toString());
    }

    @Test
    public void testBetween() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        LocalDateTime localDateTime1 = LocalDateTime.of(2021,1,12,18,0);
        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println(duration);
        assertEquals("PT2H", duration.toString());
    }

    @Test
    public void testParse() {
        Duration duration = Duration.parse("PT2H");
        System.out.println(duration);
        assertEquals("PT2H", duration.toString());
    }

    @Test
    public void testPlus() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        LocalDateTime localDateTime1 = localDateTime.plus(Duration.ofHours(2));
        System.out.println(localDateTime1);
        assertEquals(LocalDateTime.of(2021,1,12,18,0), localDateTime1);
    }

    @Test
    public void testDurationPlus() {
        Duration duration = Duration.ofHours(2).plusMinutes(3);
        System.out.println(duration);
        assertEquals("PT2H3M", Duration.ofHours(3).plusMinutes(3).plusHours(-1).toString());
    }

    @Test
    public void testNormalize() {
        Duration duration = Duration.ofMinutes(250);
        System.out.println(duration);
        assertEquals("PT4H10M", duration.toString());
    }

}