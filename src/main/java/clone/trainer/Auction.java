package clone.trainer;

import java.time.LocalDateTime;

public class Auction {

    private int price;

    private LocalDateTime start;

    private User user;

    public Auction(int price, LocalDateTime start,User user) {
        this.price = price;
        this.start = start;
        this.user = user;
    }

    public Auction(Auction another) {
        price = another.price;
        start = another.start;
        user = another.user;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public User getUser() {
        return user;
    }
}
