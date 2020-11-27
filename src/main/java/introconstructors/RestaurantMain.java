package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant("Muskátli", 10);
        System.out.println(rest.getName());
        System.out.println(rest.getCapacity());
        System.out.println(rest.getMenu());


        }
    }

