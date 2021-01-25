package iostringwriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {


    public void writeEmployees(Writer writer) {
        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        PrintWriter printWriter = new PrintWriter(writer);
        for (String employee : employees) {
            printWriter.print(employee);
            printWriter.print(", ");
            printWriter.println(200_000);
            //printWriter.println();
        }
    }


    public static void main(String[] args) {
        Path file = Path.of("employees.txt");
//        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
//            new EmployeeService().writeEmployees(writer);
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not write file", ioe);
//        }
        try (StringWriter stringWriter = new StringWriter()) {
            new EmployeeService().writeEmployees(stringWriter);
            System.out.println(stringWriter.toString());
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
