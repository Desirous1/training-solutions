package week08d01;

import java.util.Objects;

public class Cord {

    private int xCord;
    private int yCord;

    public Cord(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public int getXCord() {
        return xCord;
    }

    public int getYCord() {
        return yCord;
    }

    @Override
    public String toString() {
        return "Cord{" +
                "xCord=" + xCord +
                ", yCord=" + yCord +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cord cord = (Cord) o;
        return xCord == cord.xCord && yCord == cord.yCord;
    }
}
