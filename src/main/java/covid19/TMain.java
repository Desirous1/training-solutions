package covid19;

import java.util.Scanner;

public class TMain {

    private TService tService;

    public TMain() {
        this.tService = new TService();
    }

    private String[] menuItems = {
            "1. Regisztráció",
            "2. Tömeges regisztráció",
            "3. Generálás",
            "4. Oltás",
            "5. Oltás meghiúsulás",
            "6. Riport",
            "7. Kilépés"
    };

    public void printMenu() {
        for (String i : menuItems) {
            System.out.println(i);
        }
    }

    public int runMenu() {
        System.out.println("Kérem válasszon menüpont számot!");
        Scanner scanner = new Scanner(System.in);
        int choos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Választott menü: " + menuItems[choos - 1]);
        switch (choos) {
            case 1:
                tService.registration();
                break;
            case 2:
                //tService.registrationFromCsv();
                break;
            case 3:
                tService.generation();
                break;
            case 4:
                //office.printAreas();
                break;
            case 5:
                //office.printMeetingRoomsWithName();
                break;
            case 6:
                //office.printMeetingRoomsContains();
                break;
            default:
                break;
        }
        return choos;
    }


    public static void main(String[] args) {

        TMain tMain = new TMain();

        int choos = 0;
        do {
            tMain.printMenu();
            choos = tMain.runMenu();
            if (choos >= 7) System.out.println("Viszlát");
        } while (choos < 7);
    }

}
