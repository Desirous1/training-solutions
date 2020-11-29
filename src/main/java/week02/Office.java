package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();


        public void addMeetingRoom(MeetingRoom paraText) {
            meetingRooms.add(paraText);
            return;
        }

        // 1.
        public void printName(){

        }
        // 2.
        public void printNameReverse(){

        }

        // 3.
        public void printEventNames(){

        }

        // 4.
        public void printAreas() {
            for (MeetingRoom oi: meetingRooms  ) {
                System.out.println(oi.getName() + " room, lenght: " + oi.getLength() + ", width: " + oi.getWidth() +
                        ", area: " + oi.getArea(oi.getLength(), oi.getWidth()));
            }
            System.out.println();
        }

        // 5.
        public void printMeetingRoomsWithName(){

        }

        // 6.
        public void printMeetingRoomsContains(){

        }

        // 7.
        public void printAreasLargerThan(){

        }
}

