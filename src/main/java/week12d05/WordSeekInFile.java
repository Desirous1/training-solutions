package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordSeekInFile {

    public void seekW() {
        Path file = Path.of("index.html");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            int counter = 0;
            int counter2 = 0;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                if (line.contains("koronavírus")) {
                    counter++;
                }
                if (line.contains("Koronavírus")) {
                    counter2++;
                }
            }
            System.out.println("koronavírus: "+ counter + " db előfordulás");
            System.out.println("Koronavírus: "+ counter2 + " db előfordulás");
        } catch (IOException ioe) {

        }
    }

    public static void main(String[] args) {
        WordSeekInFile wordSeekInFile = new WordSeekInFile();
        wordSeekInFile.seekW();
    }


}

