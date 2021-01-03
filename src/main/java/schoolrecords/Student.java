package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Mark oi : marks) {
            sum = sum + oi.getMarkType().getValue();
        }
        sum = sum / marks.size();
        return Double.valueOf(String.format(Locale.UK, "%.2f", sum));
    }

    public double calculateSubjectAverage(Subject paraSubject) {
        if (marks.isEmpty() || paraSubject == null) {
            return 0.0;
        }
        double sum = 0.0;
        int count = 0;
        for (Mark oi : marks) {
            if (oi.getSubject().getSubjectName().equals(paraSubject.getSubjectName())) {
                sum = sum + oi.getMarkType().getValue();
                count++;
            }
        }
        if (count != 0) {
            sum = sum / count;
        }
        return sum;
    }

    public void grading(Mark paraGrad) {
        if (paraGrad == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(paraGrad);
    }

    private boolean isEmpty(String paraStr) {
        return paraStr == null || paraStr.isEmpty();
    }


    @Override
    public String toString() {
        String result;
        result = name + " marks: ";
        for (Mark oi : marks) {
            result = result + oi.getSubject() + ": " + oi.getMarkType();
        }
        return result;
    }
}
