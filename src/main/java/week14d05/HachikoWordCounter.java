package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class HachikoWordCounter {

    public Map<String, Integer> countWords(BufferedReader reader, String... words) {
        Map<String, Integer> result = new HashMap<>();
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                countWordsInLine(line, result, words);
            }
            } catch(IOException ioe){
                throw new IllegalStateException("Can not read file", ioe);
            }
            return result;
        }


        public void countWordsInLine(String line, Map<String, Integer > result, String...words) {
            for (String word : words) {
                if (line.contains(word)) {
                    Integer prevValue = result.get(word);
                    if (prevValue == null) {
                        result.put(word, 1);
                    } else {
                        result.put(word, prevValue + 1);
                    }
                }
            }
        }


    public static void main(String[] args) {

        try (BufferedReader reader = Files.newBufferedReader(Path.of("hachiko.srt"), Charset.forName("windows-1250"))) {
            System.out.println(new HachikoWordCounter().countWords(reader,
                    "Hachiko", "haza", "pályaudvar", "jó"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error read lines", ioe);
        }
    }
}

