package training;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) throws IOException { //throws IOException {

        Path file = Path.of("employees.txt");

        //Fájl olvasása
        //=====================
        List<String> content = null;
        try {
            // content= Files.readString(file, Charset.forName("iso-8859-2"));
            content = Files.readAllLines(file, Charset.forName("iso-8859-2"));
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        System.out.println(content);

        //Fájl írása
        //=====================
        try {
            //Files.writeString(file, "John Doe", StandardOpenOption.APPEND);  // string kiírása
            Files.write(file, List.of("John Doe", "Jane Doe"));                 // lista kiírása
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file", e);
        }
        System.out.println(Files.readAllLines(file, Charset.forName("iso-8859-2")));

        //Bájtos fájl olvasás írás
        Path file2 = Path.of("data.dat");
        try {
            Files.write(file2, new byte[]{97, 98, 99});
        } catch (IOException e) {
            throw new IllegalStateException("Can  not write file", e);
        }
        System.out.println("readAllLine: " + Files.readAllLines(file2));
        System.out.println("readAllByte: " + Files.readAllBytes(file2));
        try {
            byte[] content2 = Files.readAllBytes(file2);
            System.out.println("readAllByte: (byte tömbbe olvasva) " + Arrays.toString(content2));
        } catch (IOException ee) {
            throw new IllegalStateException("Can not read file", ee);
        }

        //Fájl olvasása Readerrel bufferrel
        Path file3 = Path.of("employees.txt");
        try (BufferedReader reader = Files.newBufferedReader(file3)) {
            String line;
            while ((line = reader.readLine()) !=null ){
                //line = reader.readLine();
                System.out.println(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        //String írása Writerrel

    }
}
