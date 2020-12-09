package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

        public void addMeetingRoom(MeetingRoom paraMeetingRoom) {
            meetingRooms.add(paraMeetingRoom);
        }

        // 1.
        public void printName(){
            for (MeetingRoom oi: meetingRooms  ) {
                System.out.println(oi.getName());
            }
            System.out.println();
        }
        // 2.
        public void printNameReverse(){
            for (int i=meetingRooms.size()-1; i >= 0; i--) {
                System.out.println(meetingRooms.get(i).getName());  //+ " , " + meetingRooms.get(i).getLength() + " , " +
                        //meetingRooms.get(i).getWidth() + " , " + meetingRooms.get(i).getArea());
            }
        }

        // 3.
        public void printEventNames(){
            if(meetingRooms.size()>0) {
                for (int i = 1; i < meetingRooms.size(); i=i+2) {
                    System.out.println(meetingRooms.get(i).getName());
                }
            }
            System.out.println();
        }

        // 4.
        public void printAreas() {
            for (MeetingRoom oi: meetingRooms  ) {
                System.out.println(oi.getName() + " room, lenght: " + oi.getLength() + ", width: " + oi.getWidth() +
                        ", area: " + oi.getArea());
            }
            System.out.println();
        }

        // 5.
        public void printMeetingRoomsWithName(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kérem a tárgyaló nevét? ");
            String searchChars = scanner.nextLine().toLowerCase();
            //int counter = 0 ;
            for (MeetingRoom oi: meetingRooms ) {
                if ( oi.getName().toLowerCase().equals(searchChars) ) {
                    System.out.println(oi.getName() + " , " + oi.getLength() + " , " + oi.getWidth() + " , " + oi.getArea());
                 //   counter++;
                }
            }
               // if ( counter == 0) {System.out.println("Nincs ilyen nevű tárgyaló"); }
            System.out.println();
        }

        // 6.
        public void printMeetingRoomsContains(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kérek egy szövegrészt? ");
            String searchChars = scanner.nextLine().toLowerCase();
            for (MeetingRoom oi: meetingRooms ) {
             if ( oi.getName().toLowerCase().contains(searchChars) ) {
                 System.out.println(oi.getName() + " , " + oi.getLength() + " , " + oi.getWidth() + " , " + oi.getArea());
             }
            }
            System.out.println();
        }

        // 7.
        public void printAreasLargerThan(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kérek egy egész számot? ");
            int area = scanner.nextInt();
            scanner.nextLine();
            for (MeetingRoom oi : meetingRooms   ) {
                if ( area < oi.getArea() ) {
                    System.out.println(oi.getName() + " , " + oi.getLength() + " , " + oi.getWidth() + " , " + oi.getArea());
                }
            }
            System.out.println();
        }
}

