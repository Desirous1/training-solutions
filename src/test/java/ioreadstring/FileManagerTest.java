package ioreadstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    private FileManager fm = new FileManager("Nevek.txt");

    @Test
    public void readFromFile() {
        fm.readFromFile();
        assertEquals(4,fm.getHumans().size());
        assertEquals("meg",fm.getHumans().get(1).getSecondName());

    }
}