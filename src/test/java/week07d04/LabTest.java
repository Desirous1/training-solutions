package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    public void testTitle() {
        Lab lab = new Lab("Nyelvi elemek");
        assertEquals(false, lab.isCompleted());
    }

    @Test
    public void testDate() {
        Lab lab = new Lab("Nyelvi", LocalDate.of(2020, 12, 21));
        System.out.println(lab.isCompleted());
        assertEquals(true, lab.isCompleted());
    }

    @Test
    public void testComplete() {
        Lab lab = new Lab("a");
        System.out.println(lab.isCompleted() + " " + lab.getCompletedAt());
        lab.complete(LocalDate.of(2020,12,12));
        System.out.println(lab.isCompleted() + " " + lab.getCompletedAt());
        assertEquals(true, lab.isCompleted());
    }

    @Test
    public void testCompleteNull() {
        Lab lab = new Lab("a");
        System.out.println(lab.isCompleted() + " " + lab.getCompletedAt());
        lab.complete();
        System.out.println(lab.isCompleted() + " " + lab.getCompletedAt());
        assertEquals(true, lab.isCompleted());
    }

}