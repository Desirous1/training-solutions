package periodduration;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;
import static org.junit.jupiter.api.Assertions.*;


public class PeriodTest {

    @Test
    public void testPeriod() {
        Period period = Period.ofDays(5);
        System.out.println(period);
        assertEquals(5, period.getDays());

        Period period2 = Period.of(1, 2, 3);
        System.out.println(period2);
        assertEquals(2, period2.getMonths());
    }

    @Test
    public void testParse() {
        String s = "P2Y3M";
        Period period = Period.parse(s);
        System.out.println(period);
        assertEquals(3, period.getMonths());
    }

    @Test
    public void testBetween() {
        LocalDate localDate = LocalDate.of(2021, 1, 12);
        LocalDate localDate1 = LocalDate.of(2021, 1, 9);
        Period period = Period.between(localDate, localDate1);
        System.out.println(period);
        assertEquals(-3, period.getDays());
    }

    @Test
    public void testNormalize() {
        Period peroid = Period.ofMonths(20).normalized();
        System.out.println(peroid);
    }

    @Test
    public void testPlus() {
        LocalDate localDate = LocalDate.of(2021,1,12);
        Period period = Period.ofDays(3);
        LocalDate localDate1 = localDate.plus(period);
        System.out.println(localDate1);
        assertEquals(15, localDate1.getDayOfMonth());
    }

    @Test
    public void testPeriodPlus() {
        Period period = Period.ofDays(2);
        Period period1 = period.plusMonths(2);
        System.out.println(period1);
        assertEquals("P2M2D", period1.toString());
    }

}