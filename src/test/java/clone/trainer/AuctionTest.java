package clone.trainer;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class AuctionTest {

    @Test
    public  void   testClone(){
        Auction auction= new Auction(5, LocalDateTime.parse("2018-01-12T12:25"),new User("Joe"));
        //System.out.println(auction.getStart());
        Auction another = new Auction(auction);

        assertEquals(5,another.getPrice());
        assertEquals(LocalDateTime.parse("2018-01-12T12:25"), auction.getStart());

        System.out.println(another.getUser().getName());
        assertEquals("Joe",another.getUser().getName());
        auction.setPrice(10);
        auction.setStart(LocalDateTime.parse("2019-01-12T14:00"));
        assertEquals(10,auction.getPrice());
        System.out.println(auction.getStart());
        System.out.println(another.getStart());

    }




}