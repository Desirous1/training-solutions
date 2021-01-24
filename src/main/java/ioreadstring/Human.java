package ioreadstring;

public class Human {
    private String secondName;
    private String familyName;

    public Human(String secondName, String familyName) {
        this.secondName = secondName;
        this.familyName = familyName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFamilyName() {
        return familyName;
    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "secondName='" + secondName + '\'' +
//                ", familyName='" + familyName + '\'' +
//                '}';
//    }
}
