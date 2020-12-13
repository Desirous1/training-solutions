package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        if ( marks.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Mark oi : marks) {
            sum = sum + oi.getMarkType().getValue();
        }
        sum = sum / marks.size();
        return sum;
    }

    public double calculateSubjectAverage(Subject paraSubject) {
        if (marks.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (Mark oi : marks) {
            if (oi.getSubject().equals(paraSubject)) {
                sum = sum + oi.getMarkType().getValue();
                count++;
            }
        }
        sum = sum / count;
        return sum;
    }

    public void grading(Mark paraGrad) {
        marks.add(paraGrad);
    }

    private boolean isEmpty(String paraStr) {
        return paraStr == null || paraStr.isEmpty() ;
    }


    @Override
    public String toString() {
        // "" ???
        return "";
    }
}
