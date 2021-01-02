package enumtype;

public enum Coin {
    TWOHUNDRED(200), HUNDRED(100), TWENTY(50), TEN(10), FIVE(5) ;

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
