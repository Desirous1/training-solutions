package week05d05;


public class User {
    private String FirstName;
    private String lasName;
    private String email;
    public String et = "@";
    public String dot = ".";

    public User(String email) {
        if (email.indexOf(et) == -1 && email.indexOf(dot) == -1 ) {
            System.out.println("Hiba: nincs at és dot karakter");
            return;
        }
        if (email.indexOf(dot) == -1 && email.indexOf(et) > 0 ) {
            System.out.println("Hiba: nincs dot karakter, de et van");
            return;
        }
        if (email.indexOf(dot) > 0 && email.indexOf(et) == -1 ) {
            System.out.println("Hiba: nincs et karakter, de dot van");
            return;
        }
        System.out.println("Minden rendben");

    }

    public String fullName(String paraFirst, String paraLast) {
        String fullName = paraFirst + " " + paraLast;
        return fullName;
    }



    public static void main(String[] args) {
        User user = new User("d@k.jfh");
    }

}