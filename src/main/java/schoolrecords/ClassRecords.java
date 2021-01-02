package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String name;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String name, Random rnd) {
        this.name = name;
        this.rnd = rnd;
    }

    public boolean addStudent(Student paraStudent) {
        //if (paraStudent)
        students.add(paraStudent);
        return true;
    }

    public double calculateClassAverage() {

        return 0.0;
    }
    public double calculateClassAverageBySubject(Subject paraSubject) {

        return 0.0;
    }

//    public Student findStudentByName(String paraStudentName) {
//        for (Student oi: students   ) {
//            if (paraStudentName.equals(oi)) {
//
//            }
//        }
//        return S;
//    }

    public String getClassName() {

        return "";
    }

    private boolean isEmpty(String paraString) {

        return true;
    }
    public String listStudentNames() {

        return "";
    }
//    public List<StudyResultByName> listStudyResult() {
//        return ;
//    }

    public boolean removeStudent(Student paraStudent) {

        return true;
    }

//    private Student repetition() {
//     return Student;
//    }

}
