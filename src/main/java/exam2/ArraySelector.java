package exam2;
/*
Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második elemet kiválogat,
és egy szövegként összerak, szögletes zárójelek között!
A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros,
 a második, azaz egyes indexű elem páratlan, stb.

Ha nulla elemű a tömb, akkor üres stringet adjon vissza!
 */


public class ArraySelector {

    private StringBuilder result = new StringBuilder("[");

    public String selectEvens(int[] paraTomb){
        if (paraTomb.length==0) {
            return "";
        }

        for (int i=0; i < paraTomb.length;i=i+2) {
            result.append(paraTomb[i]).append(", ");
        }
        result.deleteCharAt(result.length()-1).deleteCharAt(result.length()-1).append("]");
        return result.toString();
    }
}
