package training;

import java.time.LocalDateTime;

public class Employee2 implements Audited{

    private String name;
    private LocalDateTime  createdAt;

    public Employee2(String name, LocalDateTime createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
