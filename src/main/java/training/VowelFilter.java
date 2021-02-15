package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VowelFilter {

    private String[] vowels = {"a", "á", "e", "é", "i", "í", "o", "ó", "u", "ú", "ü", "ű"};
    private StringBuilder sb = new StringBuilder();

    public StringBuilder filterFlowels(BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String oi : vowels) {
                    line = line.toLowerCase().replace( oi,"");
                }
                    sb.append(line).append("\n");
                }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sb;
    }

    public static void main(String[] args) {

        Path file = Path.of("sourceText.txt");
        try (BufferedReader readFile = Files.newBufferedReader(file)) {
            System.out.println(new VowelFilter().filterFlowels(readFile));
        } catch (IOException ioe) {
            throw new IllegalStateException("can not read file", ioe);
        }
    }
}