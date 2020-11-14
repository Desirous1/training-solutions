package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book();
        book.register("02558");

        System.out.println("Szerző: " + book.getAuthor() + "\nCím: " + book.getTitle() + "\nReg.szám: " + book.getRegNumber());

    }



}
