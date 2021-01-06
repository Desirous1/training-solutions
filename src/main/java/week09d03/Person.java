package week09d03;

import java.util.Random;

public class Person {

    private Present present;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent() {
        Random rnd = new Random();
        if(age>14) {
            int index = rnd.nextInt(Present.values().length-1)+1;
            present = Present.values()[index];
        } else {
            present = Present.values()[rnd.nextInt(Present.values().length)];
        }
    }

    public Present getPresent() {
        return present;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
