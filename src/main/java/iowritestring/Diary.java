package iowritestring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Diary {

    public void newMark(String paraName, int paraMark) {
        Path filePath = Path.of("src/main/resources/" + paraName + ".txt");
        if (Files.notExists(filePath)) {
            try {
                Files.writeString(filePath, "" + paraMark);
            } catch (IOException e) {
                throw new IllegalStateException("Can not write file!", e);
            }
        } else {
            try {
                Files.writeString(filePath, "\n" + paraMark, StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new IllegalStateException("Can not add file!", e);
            }
        }
    }

    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.newMark("John Doe", 4);
        diary.newMark("Jane Doe", 4);
        diary.newMark("John Doe", 5);
    }
}

