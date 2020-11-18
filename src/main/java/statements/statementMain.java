package statements;

public class statementMain {
    public static void main(String[] args) {

        int x = 5 + 6;
        System.out.println("x értéke: " + x);

        int y = 31 - x;
        System.out.println("y értéke: " + y);

        int z = 8;
        System.out.println("z értéke: " + z);

        boolean b = x > y ;
        System.out.println("b értéke: " + b);

        //boolean c = "true".equals(b) || z > 5;
        boolean c = b || (z > 5);

        System.out.println("c értéke: " + c);

        z++;
        System.out.println("z értéke eggyel növelve: " + z);

    }
}
