package arrayofarrays;

//import array.ArrayHandler;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size) {

        int[][] multiTabla = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int a = 0; a < size; a++) {
                multiTabla[i][a] = (i+1)  * (a + 1);
            }

        }
        return multiTabla;
    }

    public void printArrayOfArrays(int[][] a) {
        for  (int i=0; i < a.length; i++) {
            for (int q=0; q<a[i].length;q++) {
                System.out.print(a[i][q] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ArrayOfArraysMain table = new ArrayOfArraysMain();
        table.multiplicationTable(4);
        table.printArrayOfArrays(table.multiplicationTable(4));

    }



}
