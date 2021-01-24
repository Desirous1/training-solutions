package week12d03;

public class Main {
    public static void main(String[] args) {
        NumberStat ns= new NumberStat();
        ns.readFromFile("test2.txt");
        System.out.println(ns.findSmallestUnique());

    }
}
