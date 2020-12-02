package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy órát? (xx, 1-12 formátumban) ");
        int hour = scanner.nextInt();
        System.out.println("Kérek egy percet? (xx) ");
        int minute = scanner.nextInt();
        System.out.println("Kérek egy másodpercet? (xx) ");
        int second = scanner.nextInt();



        System.out.println("Kérek egy második órát? (xx, 1-12 formátumban) ");
        int hour2 = scanner.nextInt();
        System.out.println("Kérek egy második percet? (xx) ");
        int minute2 = scanner.nextInt();
        System.out.println("Kérek egy második másodpercet? (xx) ");
        int second2 = scanner.nextInt();

        Time time = new Time(hour,minute,second);
        Time time2 = new Time(hour2,minute2,second2);


        System.out.println("Ezt adtad meg első idő: " + time.toString(hour,minute,second));
        System.out.println("Ezt adtad meg második idő: " + time2.toString(hour2,minute2,second2));

        System.out.println("Első idő percben " + time.toString(hour,minute,second) + " = " + time.getInMinutes() + " perc" );
        System.out.println("Második idő másodpercben " + time2.toString(hour2,minute2,second2) + " = " + time2.getInSeconds() + " másodperc" );

        // Ezt puskáztam
        System.out.println("Az első idő korábbi, mint a második??: " + time.earlierThan(time2));




    }




}
