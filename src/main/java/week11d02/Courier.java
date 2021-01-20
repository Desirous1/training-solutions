package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {

        if (rides.size() < 1 && ride.getRide() != 1) {
            throw new IllegalArgumentException("Ride number need 1!");
        }
        if (rides.size() < 1 && ride.getRide() == 1) {
            rides.add(ride);
        } else {
            if (rides.get(rides.size() - 1).getDayNumber() > ride.getDayNumber()) {
                throw new IllegalArgumentException("Cannot record this day!");
            }
            //System.out.println(rides.get(rides.size() - 1).getRide() + 1);
            if ((rides.get(rides.size() - 1).getDayNumber() == ride.getDayNumber()) &&
                    rides.get(rides.size() - 1).getRide() + 1 > ride.getRide()) {
                throw new IllegalArgumentException("Can not record this ride!");
            }
        }
        rides.add(ride);
    }

    public int freeDay() {
        if (rides.isEmpty()) {
            throw new IllegalArgumentException("Ride is empty!");
        }
        for (int i = 0; i < rides.size(); i++) {
            if (rides.get(i).getDayNumber() - rides.get(i + 1).getDayNumber() < 0) {
                return rides.get(i).getDayNumber() + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Courier courier = new Courier();
        courier.addRide(new Ride(1, 1, 32));
        courier.addRide(new Ride(1, 2, 32));
        courier.addRide(new Ride(3, 1, 32));
        courier.addRide(new Ride(4, 1, 32));
        //System.out.println(courier.rides.get(0).toString());
        System.out.println("First free day the: " + courier.freeDay() + ".");
    }
}