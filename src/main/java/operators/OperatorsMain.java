package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(9));
        System.out.println(Integer.toBinaryString(9 << 1));
        System.out.println(Integer.toBinaryString(9 >> 1));

        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >> 1));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >>> 1));

        int i = 5;
        int j = 2;
        //j = i = 5 ;
        int z = i++ + (i-4) * j -2;
        System.out.println(i + " " + z);

        int a = 10;
        double b = (15 - a) / 2 * (double) 3;
        System.out.println(b);
    }
}
