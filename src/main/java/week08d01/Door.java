package week08d01;

public class Door {

    private boolean open = false;


    public Door(boolean open) {
        this.open = open;
    }

    public Door() {
    }

    public void doorOperation() {
            open = !open;
    }

    public boolean isOpen() {
        return open;
    }

    @Override
    public String toString() {
        return "Door{" +
                "open=" + open +
                '}';
    }
}
