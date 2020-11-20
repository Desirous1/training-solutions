package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nevét: ");
        String nev = scanner.nextLine();
        System.out.println("Kérem a születési évét: ");
        int ev = scanner.nextInt();
        System.out.println("Kérem a születési hónapot: ");
        int ho = scanner.nextInt();
        System.out.println("Kérem a születési napot: ");
        int nap = scanner.nextInt();

        Employee employee = new Employee(ev, ho, nap, nev);
        System.out.println("Név: " + employee.getName() + " Születési idő: " + employee.getDateOfBirth());
        System.out.println("Belépés dátuma: " + employee.getBeginEmployement());





    }
}
