package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product paraName) {
        boolean areNameEqual = name.equals(paraName.getName());
        boolean areCodeLengthOk = code.length()-paraName.getCode().length() <= 1 && code.length() - paraName.getCode().length() >= -1;
        return areNameEqual && areCodeLengthOk;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Phone", "001");
        Product product2 = new Product("Phone", "0011");
        Product product3 = new Product("Phone", "00111");

        System.out.println(product1.areTheyEqual(product2));
        System.out.println(product1.areTheyEqual(product3));

    }

}
