package week02;

import java.util.Scanner;

public class Controller {

        String[] menuItems = {"1. Tárgyalók sorrendben.", "2. Tárgyalók visszafele sorrendben.",
                              "3. Minden második tárgyaló.", "4. Területek.", "5. Keresés pontos név alapján.",
                              "6. Keresés", "7. Keresés terület alapján", "8. Kilépés"};

        Office office = new Office();

        public void readOffice() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("How much meeting room do you want?? ");
            int db = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i < db+1; i++) {
                System.out.println("Please name of the " + (i) + ". meeting room? ");
                String paraNev = scanner.nextLine();
                System.out.println("Please lenght of the " + (i) + ". meeting room? ");
                int paraLenght = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please width of the " + (i) + ". meeting room? ");
                int paraWidth = scanner.nextInt();
                scanner.nextLine();
                office.addMeetingRoom( new MeetingRoom(paraNev, paraLenght, paraWidth));
            }
        }

        public void printMenu() {
            for (String i: menuItems){
                System.out.println(i);
            }
        }

        public void runMenu() {

            System.out.println("Please chose number of menu item!");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    office.printName();
                    return ;
                case 2:
                    office.printNameReverse();
                    return ;
                case 3:
                    office.printEventNames();
                    return ;
                case 4:
                    office.printAreas();
                    return ;
                case 5:
                    office.printMeetingRoomsWithName();
                    return ;
                case 6:
                    office.printMeetingRoomsContains();
                    return ;
                case 7:
                    office.printAreasLargerThan();
                    return ;
                case 8:
                    break;
            }
        }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
             controller.printMenu();
             controller.runMenu();
    }
}