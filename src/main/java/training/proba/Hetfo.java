package training.proba;

import java.util.ArrayList;
import java.util.List;

public class Hetfo {

    public void say(String message) {
        System.out.println(message);

        message = "kutty";
        System.out.println(message);
    }


    public void setEmployyeName(Employye employye) {
        Employye newEmployye = new Employye();
        newEmployye.setName("Jack");
        employye = newEmployye;
    }


    public void modList(List<String> names){
        //names.add("Jane");
        names = List.of("a", "b", "c", "d");
    }

    public static void main(String[] args) {
        Hetfo hf = new Hetfo();
//
//        String msg = "Struc";
//        hf.say(msg);
//
//        System.out.println(msg);
//
        Employye joeEmployye = new Employye();
        joeEmployye.setName("Joe");
        hf.setEmployyeName(joeEmployye);
        System.out.println(joeEmployye.getName());


        List<String> names = new ArrayList<>();
        names.add("Joe");

        hf.modList(names);
        System.out.println(names);
    }
}
