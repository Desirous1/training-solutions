package methodstructure;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Termék neve {" + name + '\'' + " , kapacitása=" + capacity + ", ára=" + price + '}';
    }

    public void risePrice(int percent) {
        price +=  price * ( percent / 100);   // price =  price + (price * ( percent / 100)));
    }

    public boolean cheaperThan(Pendrive other) {
        return this.price < other.price;
    }

    public int comparePricePerCapacity(Pendrive other) {
        double ppc = pricePerCapacity();
        double otherPpc = other.pricePerCapacity();
        if (ppc > otherPpc) {
            return 1;
        }
        if (ppc < otherPpc) {
            return -1;
        }
        return  0;
    }

    private double pricePerCapacity() {
        return (double)price/capacity;
    }
}
