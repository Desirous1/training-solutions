package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {
        for (int keres: source ) {
            if ( keres==itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i=0; i<source.length; i++) {
            if ( source[i] == itemToFind ) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] a= { 1, 2, 3};

        System.out.println(arrayHandler.contains(a, 3) ) ;
        System.out.println(arrayHandler.find(a, 1) ) ;


    }


}
