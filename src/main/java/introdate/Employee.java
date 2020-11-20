package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Employee {
    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployement;

    public Employee(int year, int mont, int day, String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year,mont,day)  ;  //dateOfBirth
        this.beginEmployement = LocalDateTime.now() ;  // beginEmployement
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployement() {
        return beginEmployement;
    }

    public void setName(String name) {
        this.name = name;
    }


}
