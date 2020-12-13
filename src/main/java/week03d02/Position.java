package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return getName();
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        positions.add(new Position("Junior", 120_000));
        positions.add(new Position("Senior", 320_000));
        positions.add(new Position("Superior", 620_000));

        for (Position oi: positions ) {
            if( oi.getBonus() > 150000 ) {
                System.out.println(oi.toString());
            }
        }
    }
}
