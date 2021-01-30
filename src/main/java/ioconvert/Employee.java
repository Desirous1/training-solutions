package ioconvert;

import java.io.*;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class Employee {
    public static void main(String[] args) {
        Path path = Path.of("data.dat");

        try (PrintStream os = new PrintStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.println("John Doe");
            System.out.println();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }


}
