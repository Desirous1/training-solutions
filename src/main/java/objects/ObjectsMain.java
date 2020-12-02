package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        new Book();

        Book[] books = {new Book(), new Book( ), new Book()};

        List<Book> books2 = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> books3 = new ArrayList<>();
        books3.add(new Book());
        books3.add(new Book());
        books3.add(new Book());

        System.out.println("books : " + books.length);
        System.out.println("books2 : " + books2.toString());
        System.out.println("books3 : " + books3.isEmpty());

    }




}
