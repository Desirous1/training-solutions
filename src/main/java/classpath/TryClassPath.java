package classpath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class TryClassPath {

    public List<String> readLines(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        return Arrays.asList("dd", "grte");
    }

    public static void main(String[] args) {
        //try (BufferedReader rd = new BufferedReader(new InputStreamReader(TryClassPath.class.getResourceAsStream("proba55.txt")))) {
        try (BufferedReader rd = Files.newBufferedReader(Path.of("proba55.txt"))) {
            new TryClassPath().readLines(rd);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}