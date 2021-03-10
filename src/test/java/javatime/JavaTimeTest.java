package javatime;

import org.junit.jupiter.api.Test;

import java.text.Normalizer;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTimeTest {

    @Test
    public void testLocalDateTime(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.of(2021, Month.MARCH,12);
        System.out.println(localDate1);

        LocalDateTime localDateTime1 = LocalDateTime.of(2021,1,12,16,0);
        System.out.println(localDateTime1);
        assertEquals("2021-01-12T16:00", localDateTime1.toString());

        LocalTime localTime1 = LocalTime.of(16,0);
        System.out.println(localTime1);
        assertEquals("16:00", localTime1.toString());

        System.out.println(localDateTime1.plusDays(1).plusHours(1));

        assertEquals(true, localDateTime.isAfter(localDateTime1));
    }

    @Test
    public void testConvert() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        assertEquals("2021-01-12", localDate.toString());
        assertEquals("16:00", localTime.toString());

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        assertEquals("2021-01-12T16:00", localDateTime1.toString());
    }

    @Test
    public void testJavaUtilDate() {
        Date date = new Date();
        LocalDateTime localDateTime =
                LocalDateTime.ofInstant(date.toInstant(),
                        ZoneId.systemDefault());
        System.out.println(localDateTime);

        Date date1 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);
    }

    @Test
    public void testChronoUnit() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021,1,16,16,0);

        System.out.println(ChronoUnit.DAYS.between(localDateTime, localDateTime2));
        assertEquals(4L, ChronoUnit.DAYS.between(localDateTime, localDateTime2));
    }

    @Test
    public void testField() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        assertEquals(12, localDateTime.getDayOfMonth());
    }

    @Test
    public void testFormat() {
        LocalDateTime localDateTime = LocalDateTime.of(2021,1,12,16,0);
        DateTimeFormatter formatter =
            //DateTimeFormatter.ISO_LOCAL_DATE;
            //DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
             DateTimeFormatter.ofPattern("yyyy. MMMM dd. hh:mm").withLocale(Locale.ENGLISH);
        String s = localDateTime.format(formatter);
        System.out.println(s);
    }

    @Test
    public void testParse() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); //.withLocale(Locale.ENGLISH);
        String s = "2021-01-12 16:00";
        LocalDateTime localDateTime =
                LocalDateTime.parse(s, formatter);
        System.out.println(localDateTime);
        assertEquals(12, localDateTime.getDayOfMonth());

    }
}
