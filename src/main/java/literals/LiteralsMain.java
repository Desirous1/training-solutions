package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        String ab = Integer.toString(a)+Integer.toString(b);
        System.out.println(ab );

        double quotient = (float) 3 / 4;
        System.out.println(quotient);

        System.out.println("0b" + Integer.toBinaryString(2) );

    }
}
