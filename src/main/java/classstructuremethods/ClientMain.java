package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1966);
        client.setAddress("NY 12538 New York, Hyde Park 361.");
        System.out.println("Név: " + client.getName() + "\n" +
                           "Születési év: " + client.getYear() + "\n" +
                           "Lakcím: " + client.getAddress());

        client.migrate("HU Budapest IV. kerület Országház 77.");
        System.out.println("Címét a következőre módosítottuk: " +
                            client.getAddress());
    }

}
