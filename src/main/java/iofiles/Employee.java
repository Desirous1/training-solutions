package iofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Employee {
    public static void main(String[] args) {
        Path path = Path.of("data.dat");
        System.out.println(Files.exists(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isRegularFile(path));
        try {
            System.out.println(Files.size(path));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not get size", ioe);
        }
        try {
            Files.copy(path, Path.of("data2.dat"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not copy file", ioe);
        }
        try {
            Files.delete(Path.of("data2.dat"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not deleted file", ioe);
        }
    }
}
