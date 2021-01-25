package idreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.notExists;

public class IdManager {

    public void readIdsFromFile(String fileName) {
        if (fileName == "") {
            throw new IllegalArgumentException("nem lehet üres a file neve");
        }

        Path file = Path.of(fileName);
        if(notExists(file) ) {
            throw  new IllegalStateException("Can not found file: " + file);
        }
        List<String> ids = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                ids.add(line);
            }
            for (String oi : ids) {
                System.out.println(oi);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {
        IdManager idManager = new IdManager();
        idManager.readIdsFromFile("idnumbers.txt");
    }

}
