package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger paraPassenger) throws IllegalArgumentException {
        if (boat.getMaxPassengers() > passengers.size()) {
            passengers.add(paraPassenger);
        } else {
            throw new IllegalArgumentException("Full capacity");
        }
    }

    public double getPriceForPassenger(Passenger paraPassenger) {
        return paraPassenger.getCruiseClass().getValue() * basicPrice;
    }


    public Passenger findPassengerByName(String paraName){
        for(Passenger oi: passengers){
            if(paraName.equals(oi.getName())) {
                return oi;
            }
        }
        return null;
    }


    public List<String> getPassengerNamesOrdered(){
        List<String> nameSortList = new ArrayList<>();
        for(Passenger oi: passengers){
            nameSortList.add(oi.getName());
        }
        Collections.sort(nameSortList);
        return nameSortList;
    }

    public double sumAllBookingsCharged(){
        double sum = 0.0;
        for(Passenger oi: passengers){
            sum += getPriceForPassenger(oi);
        }
        return sum;
    }


     public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> cruiseClassMap = new HashMap<>();
        for(Passenger oi: passengers) {
            if(cruiseClassMap.containsKey(oi.getCruiseClass())){
                cruiseClassMap.put(oi.getCruiseClass(), cruiseClassMap.get(oi.getCruiseClass()) +1 );
            } else {
                cruiseClassMap.put(oi.getCruiseClass(), 1 );
            }
        }
        return cruiseClassMap;
     }




    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }


}
