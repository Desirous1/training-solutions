package objects;

import java.awt.print.Book;
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

    }




}
