package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        message = message + 444;
        System.out.println(message);

        boolean b = "Hello John Doe".equals(message);
        System.out.println(b);

        boolean c = "Hello John Doe444".equals(message);
        System.out.println(c);

        String x = "";
        String z = "";
        String w = x + z;
        System.out.println(w.length());

        String txt = "Abcde";
        System.out.println(txt.length());

        System.out.println(txt.substring(0,1)  + " , " + txt.substring(2,3) );
        // System.out.println(txt.charAt(0) + " , " + txt.charAt(2)); az előző sorral megegyező eredményű
        System.out.println(txt.substring(0,2));




    }
}
