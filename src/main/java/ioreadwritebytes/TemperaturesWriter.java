package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {

    public void writeTemperatures(Temperatures paraTemp, String pathString) {
        Path path = Path.of(pathString);
        try {
            Files.write(path, paraTemp.getData());
        } catch (IOException e) {
            throw new IllegalStateException("Can't write file", e);
        }
    }
}
