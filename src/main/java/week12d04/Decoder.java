package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Decoder {
    public void decode(Path path) {
        //1try {
        try (InputStream is = Files.newInputStream(path)) {
            //1 byte[] bytes = Files.readAllBytes(path);
            byte[] buffer = new byte[10];
            //1for (byte b : bytes) {
            int size;
            while( (size = is.read(buffer)) > 0 ){
                //for (byte b : bytes) {
                for (int i=0; i< size;i++) {
                    char c = (char) (buffer[i] + 10);
                    System.out.print(c);
                }
                //1 }
            }
        }
         catch (IOException ioe) {
            throw new IllegalStateException("", ioe);
        }
    }

    public static void main(String[] args) {
        new Decoder().decode(Path.of("secret.dat"));
    }
}

