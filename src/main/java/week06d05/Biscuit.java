package week06d05;

public class Biscuit {

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public void setGramAmount(int gramAmount) {
        this.gramAmount = gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount) {
        return new Biscuit(type, gramAmount);
    }


    public static void main(String[] args) {
        BiscuitType type = BiscuitType.PILOTA;

        //type.setGramAmount(12);

        System.out.println("Objektum címe:");
        System.out.println(of(BiscuitType.PILOTA, 33));
        System.out.println("Objektum állapota, változók értéke:");
        System.out.println(type.toString() + " " + type.getGramAmount());

    }

}
