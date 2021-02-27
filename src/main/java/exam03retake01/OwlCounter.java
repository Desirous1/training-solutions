package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlMap = new HashMap<>();

    public void readLines() {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("owl.txt"))) {
            readFromFile(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] sub = line.split("=");
            owlMap.put(sub[0], Integer.parseInt(sub[1]));
        }
    }

    public Integer getNumberOfOwls(String paraMegye) {
            return owlMap.get(paraMegye);
        }
}

