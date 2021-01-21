package iowriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");

        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (String employee : employees) {
                writer.write(employee);
                writer.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
