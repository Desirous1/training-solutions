package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String name, Random rnd) {
        this.className = name;
        this.rnd = rnd;
    }

    public boolean addStudent(Student paraStudent) {
        for (Student oi : students) {
            if (oi.getName().equals(paraStudent.getName())) {
                return false;
            }
        }
        students.add(paraStudent);
        return true;
    }

    public boolean removeStudent(Student paraStudent) {
        for (Student oi : students) {
            if (oi.getName().equals(paraStudent.getName())) {
                return students.remove(oi);
            }
        }
        return false;
    }

    // szerintem nem jó
    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double classAverage = 0.0;
        for (Student oi : students) {
            classAverage = classAverage + oi.calculateAverage();
        }
        if (classAverage == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return classAverage / students.size();
    }

    public double calculateClassAverageBySubject(Subject paraSubject) {
        double resultAverage = 0.0;
        int counter = 0;
        for (Student oi : students) {
//            System.out.println(oi.calculateSubjectAverage(paraSubject));
            resultAverage = resultAverage + oi.calculateSubjectAverage(paraSubject);
            if (oi.calculateSubjectAverage(paraSubject) != 0) {
                counter++;
            }
        }
        if (students.size() == 0) {
            return 0.0;
        }
        return resultAverage / counter;
    }

    public Student findStudentByName(String paraStudentName) {
        if ( paraStudentName.equals("") ) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        for (Student oi : students) {
            if (oi.getClass().getName().equals(paraStudentName)) {
                return oi;
            }
        }
        throw new IllegalStateException("No students to search!");
    }

    public String getClassName() {
        return className;
    }

//    private boolean isEmpty(String paraString) {
//
//        return true;
//    }

//    public String listStudentNames() {
//
//        return "";
//    }
//    public List<StudyResultByName> listStudyResult() {
//        return ;
//    }


    public Student repetition() {
        return students.get(rnd.nextInt(5));
    }

    public List<Student> getStudents() {
        return students;
    }

}
