package array;

public class ArrayMain {
    public static void main(String[] args) {

        String[] dayName = { "Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println("Az dayName tömb második eleme: " + dayName[1]);
        System.out.println("Az dayName tömb hossza: " + dayName.length);

        int[] hatvanyok = new int[5];
        hatvanyok[0] = 1;
        for (int i=1; i<hatvanyok.length; i++ ) {
            hatvanyok[i] = hatvanyok[i-1] * 2;
        }
        for (int tomb: hatvanyok ) {
            System.out.println(tomb);
        }



        /*    int[] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }

        for (int i = 0; i < powersOfTwo.length; i++) {
            System.out.print(powersOfTwo[i] + " ");
        }
        */








    }
}
