package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {
        StringBuilder sb =new  StringBuilder();
        try {
            String line = Files.readString(file);
            for (Employee employee : employees) {
                String result = line;
                result = result.replace("{nev}", employee.getName());
                result = result.replace("{ev}", String.valueOf(employee.getYearOfBirth()));
                sb.append(result);
                sb.append("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cant read file", ioe);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Path path = Path.of("employee-template.txt");
        List<Employee> employees = List.of(
                new Employee("John Doe", 2001),
                new Employee("Jane Doe", 1222)
        );
        System.out.println(new TemplateMerger().merge(path, employees));
    }

}
/*Írj egy a TemplateMerger osztályba egy public String merge(Path file, List<Employee> employees) metódust,
ami felolvassa a fájlt, melynek tartalma:

Az alkalmazott neve: {nev}, születési éve: {ev}
Nyugodtan beolvashatod egy utasítással!

Majd a visszatérési értékként add vissza soronként az alkalmazottakat, abban a formátumban, mint ahogy a fájlban van, azaz:

Az alkalmazott neve: John Doe, születési éve: 1980
Az alkalmazott neve: Jack Doe, születési éve: 1990
(Persze ehhez kell egy Employee osztály is a megfelelő attribútumokkal.

*/
