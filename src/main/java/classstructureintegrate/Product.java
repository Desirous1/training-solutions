package classstructureintegrate;

import java.util.Scanner;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int increasePrice(int paramPrice) {
        price += paramPrice;
        return price;
    }

    public int decreasePrice(int paramPrice) {
        price -= paramPrice;
        return price;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy terméket: ");
        String name = scanner.nextLine();

        System.out.println("Kérem az árát: ");
        int price = scanner.nextInt();

        scanner.nextLine();
        Product product = new Product(name, price);

        System.out.println(product.getName() + " " + product.getPrice() + " Ft");

        product.increasePrice(20);
        System.out.println(product.getName() + " " + product.getPrice() + " Ft");

        product.decreasePrice(30);
        System.out.println(product.getName() + " " + product.getPrice() + " Ft");
    }
}
