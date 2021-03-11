package periodduration;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ZoneTest {

    @Test
    public void testToneId() {
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneId = ZoneId.of("Europe/Prague");
        assertEquals(true, ZoneId.getAvailableZoneIds().contains(zoneId.toString()));
    }

    @Test
    public void testZonedDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Budapest"));
        System.out.println(zonedDateTime);
        assertEquals("2021-01-12T16:00+01:00[Europe/Budapest]", zonedDateTime.toString());
    }

    @Test
    public void testChange() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Budapest"));
        ZonedDateTime zonedDateTime1 =
                zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(zonedDateTime1);
        assertEquals("2021-01-12T15:00Z[UTC]", zonedDateTime1.toString());
    }

    @Test
    public void testDaylightSaving() {
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(LocalDateTime.of(2021,3,28,1,59),
                        ZoneId.of("Europe/Budapest"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.plusMinutes(1);
        System.out.println(zonedDateTime1);
        assertEquals("2021-03-28T03:00+02:00[Europe/Budapest]", zonedDateTime1.toString());

    }
}