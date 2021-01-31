package week13d02;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FlightData {
    private String flightNumber;
    private String flightDirection;
    private String city;
    private LocalTime time;

    public FlightData(String flightNumber, String fligthDirection, String city, LocalTime time) {
        this.flightNumber = flightNumber;
        this.flightDirection = fligthDirection;
        this.city = city;
        this.time = time;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightDirection() {
        return flightDirection;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "flightNumber='" + flightNumber + '\'' +
                ", flightDirection='" + flightDirection + '\'' +
                ", city='" + city + '\'' +
                ", time=" + time +
                '}';
    }
}
