package training;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) throws IOException {

        Path file = Path.of("employees.txt");

        List<String> content = null;

        try {
           // content= Files.readString(file, Charset.forName("iso-8859-2"));
            content= Files.readAllLines(file, Charset.forName("iso-8859-2"));
        } catch (IOException e){
            throw new IllegalStateException("Can not read file", e);
        }

        System.out.println(content);

        try {
        //Files.writeString(file, "John Doe", StandardOpenOption.APPEND);  // string kiírása
        Files.write(file, List.of("John Doe","Jane Doe"));                 // lista kiírása
        } catch (IOException e){
            throw new IllegalStateException("Can not write file", e);
        }
        System.out.println(Files.readAllLines(file,Charset.forName("iso-8859-2")));

    }
}
