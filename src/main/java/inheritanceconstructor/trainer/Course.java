package inheritanceconstructor.trainer;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public static final List<introinheritance.trainer.Course> COURSES;

    static {
        List<introinheritance.trainer.Course> courses = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            courses.add(new introinheritance.trainer.Course("Course" + i));
        }
        COURSES = courses;
    }


    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
