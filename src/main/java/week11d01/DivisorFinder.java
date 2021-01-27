package week11d01;

public class DivisorFinder {

    public int finddivisor(int n) {
        n = Math.abs(n);
        int sum = 0;
        String number = Integer.toString(n);
//        for (int i = 0; i < number.length(); i++) {
//            int digit = Integer.parseInt(Character.toString(number.charAt(i)));
//            if (n % digit == 0) {
//                sum++;
//            }
//        }
//        return sum;
//    }

        for (char oi: number.toCharArray()) {
            int digit = Integer.parseInt(Character.toString(oi));
            if (n % digit == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new DivisorFinder().finddivisor(425));
    }
}
