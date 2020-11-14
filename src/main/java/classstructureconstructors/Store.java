package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        // ? kell e. this.stock = 0;
    }

    public void store(int incRe) {
        stock = stock + incRe;
    }

    public void dispatch(int redUc) {
        stock = stock - redUc;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
