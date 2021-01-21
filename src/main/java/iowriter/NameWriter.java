package iowriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    private Path fileName;

    public NameWriter(Path fileName) {
        this.fileName = fileName;
    }

    public void addAndWrite(String name) {
        try (BufferedWriter bw = Files.newBufferedWriter(fileName, StandardOpenOption.APPEND)) {
            bw.write(name + "\n");
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file!", e);
        }
    }
}
