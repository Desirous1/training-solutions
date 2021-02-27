package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String result = "";
        for (int i = 0; i < numberOfDays.length; i++) {
            result = result + numberOfDays[i] + ",";
        }
        return result.substring(0, result.length() - 1);
    }

    public List<String> daysOfWeek() {
        List<String> daysOfName = List.of("Hétfő", "Kedd", "Szerda", "Csütörtök",
                "Péntek", "Szombat", "Vasárnap");
        return daysOfName;
    }

    public String multiplicationTableAsString(int size) {
        String result = "";
        int[][] data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = (i + 1) * (j + 1);
                result = result + data[i][j] + ",";
                //System.out.println(data[i][j]);
            }
        }
        return result.substring(0, result.length() - 1);
    }

    public String sameTempValues(double[] day, double[] anotherDay) {
        int sameAs = 0;
        for (int i = 0; i < day.length; i++) {
            if ( day[i] != anotherDay[i]) {
                return "Tartalmaz eltérő adatokat";
            }
        }
        return "Azonos értékeket tartalmaz";
    }


    public static void main(String[] args) {
        ArraysMain mn = new ArraysMain();
        System.out.println(mn.numberOfDaysAsString());
        System.out.println(mn.daysOfWeek());
        String s = mn.multiplicationTableAsString(3);
        System.out.println(s);
        double[] day={12.3, 23.4 };
        double[] anotherDay={12.3, 23.5 };
        System.out.println(mn.sameTempValues(day, anotherDay ));
    }
}
