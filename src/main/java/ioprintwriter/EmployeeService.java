package ioprintwriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");

        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String employee : employees) {
                writer.print(employee);
                writer.print(",");
                writer.println(200_000);
                //writer.print("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
