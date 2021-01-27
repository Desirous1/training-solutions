package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class timetable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Path path = Path.of("beosztas.txt");
        int sumHour = 0;
        System.out.println("Kérem a tanár nevét? ");
        String tutorName = scanner.nextLine();
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while((line=reader.readLine()) != null ) {
                    if(tutorName.equals(line)) {
                        line= reader.readLine();
                        line= reader.readLine();
                        line= reader.readLine();
                        sumHour=sumHour+Integer.parseInt(line);
                    }
            }
            if(sumHour==0){
                System.out.println("Nincs ilyen nevű tanár!");
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cant read file", ioe);
        }
        System.out.println(sumHour);
    }
}
