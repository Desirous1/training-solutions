package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Fájlbeolvasás {

    public static void main(String[] args) {



        Path file = Path.of("src/main/resources/Jane Doe.txt");
        //System.out.println(Files.exists(file));
        try (BufferedReader readFile = Files.newBufferedReader(file)) {
        //try (BufferedReader readFile = Files.newBufferedReader(file, Charset.forName("windows-1250"))) {
            String line;
            while ((line = readFile.readLine()) != null) {
                //line = readFile.readLine();
                //System.out.println(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }




    }
}
