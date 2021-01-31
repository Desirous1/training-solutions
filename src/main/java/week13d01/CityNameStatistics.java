package week13d01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class CityNameStatistics {

    private String LongestName;

    public String longestName() {

        Path filePath = Path.of("cities.csv");

        String maxCityName = "";
        try {
            List<String> fileString = Files.readAllLines(filePath);
            for (int i = 1; i < fileString.size(); i++) {
                String[] oi = fileString.get(i).split(";");
                String trimmeltString = oi[1].trim();
                if (maxCityName.length() < trimmeltString.length()) {
                    maxCityName = trimmeltString;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
        return maxCityName;
    }

    public static void main(String[] args) {
        CityNameStatistics cityNameStatistics = new CityNameStatistics();
        System.out.println(cityNameStatistics.longestName());
    }

}
