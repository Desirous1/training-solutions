package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject paraSubject) {
         // return taughtSubjects.contains(paraSubject);
        for (Subject oi: taughtSubjects ) {
            if ( oi.equals(paraSubject) ) {
                return true;
            }
        }
        return false;
    }
}
