package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Sultan {

    private List<Door> doorList = new ArrayList<>();

    public void startMake() {
        for (int i = 0; i < 100; i++) {
            doorList.add(new Door(false));
        }
    }

    public void changeDoors() {
        //Sultan sultan = new Sultan();
        startMake();
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i + ". " + sultan.doorList.get(i - 1));
//        }
        for (int a = 1 ; a <= 100 ; a++) {
            for (int q = a -1; q < doorList.size(); q+=a) {
                doorList.get(q).doorOperation();
            //  System.out.println(a + " , " + q + " , " + doorList.get(q));
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ". " + doorList.get(i - 1));
        }
    }

    public Door getLastDoor() {
        return doorList.get(doorList.size()-1);
    }

}

