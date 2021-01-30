package iowritebytes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Employee {

    public static void main(String[] args) {
        Path path = Path.of("data.dat");

        try (BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(path))) {
            for (int i = 0; i < 1100; i++) {
                os.write("abcde".getBytes());
            }
        } catch (IOException oie) {
            throw new IllegalStateException("Can not write file", oie);
        }
    }

}
