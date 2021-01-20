package week11d02;

public class Ride {

    private int dayNumber;
    private int ride;
    private int distanceKm;

    public Ride(int dayNumber, int ride, int distanceKm) {

        if (dayNumber <= 0 || dayNumber > 7) {
            throw new IllegalArgumentException("Day number dont less then 0 and bigger as 7!");
        }
        this.dayNumber = dayNumber;

        if (ride < 1) {
            throw new IllegalArgumentException("Ride number need bigger then 0!");
        }
        this.ride = ride;

        if (distanceKm < 1) {
            throw new IllegalArgumentException("Distance (km) need bigger then 0!");
        }
        this.distanceKm = distanceKm;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public int getRide() {
        return ride;
    }

    public int getDistanceKm() {
        return distanceKm;
    }

    @Override
    public String toString() {
        return "dayNumber=" + dayNumber +
                ", ride=" + ride +
                ", distanceKm=" + distanceKm;
    }
}
