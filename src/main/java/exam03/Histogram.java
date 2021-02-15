package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public void readFile() {
        Path file = Path.of("resources/Histogram.txt");
        try (BufferedReader readFile = Files.newBufferedReader(file)) {
            createHistogram(readFile);
            //System.out.println();
        } catch (IOException ioe) {
            throw new IllegalStateException("can not read file", ioe);
        }
    }

    public String createHistogram(BufferedReader paraReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while((line=paraReader.readLine()) != null){
            int q = Integer.parseInt(line);
            for (int i=1; i<=q;i++){
                sb.append("*");
            }
            sb.append("\n");
        }

    return sb.toString();
    }
}
