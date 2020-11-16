package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(515.85, true);

        System.out.println(distance.getDistanceKm()+ " " + distance.isExact());

        int partOfKm = (int) distance.getDistanceKm();
        System.out.println(partOfKm);
        System.out.println(partOfKm== distance.getDistanceKm() );


    }

}
