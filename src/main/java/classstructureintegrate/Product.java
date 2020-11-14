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

        Product product = new Product("",0);

        System.out.println("Kérek egy terméket: ");
        product.name = scanner.nextLine();
        System.out.println("Kérem az árát: ");
        product.price = scanner.nextInt();
        scanner.nextLine();
        System.out.println(product.getName() + " " + product.getPrice() + " Ft");
    }
}
