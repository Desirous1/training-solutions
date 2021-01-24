package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {


    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileRelativePath) {
        this.myFile = Path.of(fileRelativePath);
    }

    public void readFromFile() {

        try {
            List<String> fileInString = Files.readAllLines(myFile);
            for (String oi : fileInString) {
                String firstAndLast[] = oi.split(" ");
                //System.out.println(firstAndLast[0]);
                Human h = new Human(firstAndLast[0], firstAndLast[1]);
                humans.add(h);
            }
            //System.out.println(humans.toString());

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public Path getMyFile() {
        return myFile;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public static void main(String[] args) {
        FileManager fileManager = new FileManager("Nevek.txt");
        fileManager.readFromFile();
    }

}
