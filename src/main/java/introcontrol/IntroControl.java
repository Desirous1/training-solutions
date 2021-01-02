package introcontrol;

public class IntroControl {

    private int number;

    public int subtractTenIfGreaterThanTen(int number) {
        if ( number <= 10 ) {
            return number;
        } else {
            return this.number = number - 10; }
    }

    public String describeNumber(int number) {
        return (number==0 ? "zero" : "not zero");
    }

    public String greetingToJoe(String name) {
        return ( name.equals("Joe") ? "Hello " + name : "nem Joe a keresztneved"  );
    }

    public int calculateBonus(int sale) {
        if ( sale > 1000000) {
            int jutalek = (int) (sale * 0.1);
            return jutalek;
        }
        return 0;
    }

    public int calculateConsumption(int prev, int next) {
        return 0;

    }




}
