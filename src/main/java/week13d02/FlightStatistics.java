package week13d02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlightStatistics {

    private List<FlightData> flightDataList = new ArrayList<>();

    public void generateFlightList() {
        Path path = Path.of("cities.txt");
        try {
            List<String> flightStrig = Files.readAllLines(path);
            for (String oi : flightStrig) {
                String[] string = oi.split(" ");
                FlightData fl = new FlightData(string[0], string[1], string[2],
                        LocalTime.parse(string[3], DateTimeFormatter.ofPattern("H:m")));
                flightDataList.add(fl);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String directionMax() {
        int sumArr = 0;
        int sumDep = 0;
        for (FlightData oi : flightDataList) {
            if ("Departure".equals(oi.getFlightDirection())) {
                sumDep++;
            } else {
                sumArr++;
            }
        }
        System.out.println("Arrival: " + sumArr);
        System.out.println("Departure: " + sumDep);
        if (sumArr > sumDep) {
            return "Arrival";
        } else {
            return "Departure";
        }
    }

    public void getStime() {
        for (FlightData oi : flightDataList) {
            System.out.println(oi.getTime());
        }
    }

    public FlightData seekFlightNumber(String paraFlightNumber) {
        for (FlightData oi : flightDataList) {
            if (paraFlightNumber.equals(oi.getFlightNumber())) {
                return oi;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen járatszám");
    }


    public List<FlightData> getFlightList(String paraCity, String paraFlightDirection) {
        List<FlightData> localList = new ArrayList<>();
        for (FlightData oi : flightDataList) {
            if (oi.getCity().equals(paraCity) && oi.getFlightDirection().equals(paraFlightDirection)) {
                localList.add(oi);
            }
        }
        return localList;
    }

    public FlightData getFirstDeparture() {
        FlightData th = flightDataList.get(0);
        for (FlightData oi : flightDataList) {
            if ("Departure".equals(oi.getFlightDirection())) {
                int result = oi.getTime().compareTo(th.getTime());
                if (result == -1) {
                    th = oi;
                }
            }
        }
        return th;
    }


    public static void main(String[] args) {
        FlightStatistics flightStatistics = new FlightStatistics();
        flightStatistics.generateFlightList();
        System.out.println(flightStatistics.directionMax());
        System.out.println(flightStatistics.seekFlightNumber("PF0180"));
        System.out.println(flightStatistics.getFlightList("Paris", "Departure"));
        System.out.println(flightStatistics.getFirstDeparture());
    }

}

/*Adott egy fájl melyben egy reptér egy napi munkáját rögzítettük. Adott egy járatszám, az, hogy érkező vagy felszálló
gépről van-e szó. A kiinduló/cél város, attól függöen hogy indul vagy érkezik-e a gép és a felszállás/leszállás pontos ideje.
​
A fájl:
FC5354 Arrival Dublin 18:16
KH2442 Departure Berlin 15:54
ID4963 Departure Amsterdam 15:22
CX8486 Arrival Brussels 10:37
EJ9251 Departure  Toronto 11:30
KJ7245 Departure Bern 6:18
JN6048 Arrival Moscow 18:39
MN5047 Arrival Athens 9:35
​
Az időpontok szándékosan így szereplnek, nincsenek nullák a számok előtt. Az adatok össze vissza szerepelnek a fájlban.
Feladatok:
1. Olvasd be a fájl tartalmát a memóriába.
2. Határozd meg, hogy induló vagy érkező járatból volt-e több.
3. Legyen egy metódus ami járatszám alapján ad vissza egy repülőt.
4. Írj egy metódust ami bekér egy várost és azt, hogy az induló vagy érkező járatokat szeretnénk-e. És egy Listába
adjuk viassza az összes abba városba induló/érkező repülőt.
5. Adjuk vissza  a legkorábban induló repülőt!
*/