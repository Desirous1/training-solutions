package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int readFile(String name) {

        //Path path = Path.of(name);
        try {
            String fileContent = Files.readString(Path.of(name));
            //int number = Integer.parseInt(fileContent);
            return Integer.parseInt(fileContent);    //number;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            //String fileName = "number" + (i < 10 ? "0" + i : i) + ".txt";
            String fileName = String.format("number%02d.txt", i);
            if (Files.isRegularFile((Path.of(fileName)))) {
                int number = readFile(fileName);
                System.out.println(fileName + (number > 99 ? " " : "  ") + number);
                sum += number;
            }
        }
        System.out.println("----------------");
        return sum;
    }


    public static void main(String[] args) {
        //System.out.println(new FilesSum().readFile("number20.txt"));
        System.out.println("Az összeg:   " + new FilesSum().sumNumbers());
    }

}