package introconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int  duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        startDateTime = LocalDateTime.now();
        //LocalDateTime.of(2020,10,27, 10,25);
    }


}
