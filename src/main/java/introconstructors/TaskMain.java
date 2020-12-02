package introconstructors;

import java.text.DateFormat;
import java.text.DateFormatSymbols;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Tanulás", "Ismétlés 1-től 3-ig.");

        System.out.println("Title: " + task.getTitle());

        System.out.println("Description: " + task.getDescription() );
        task.start();

        task.setDuration(100);

        System.out.println("Start at " + task.getStartDateTime() + " End: " + task.getDuration());

    }
}
