package week06d05;

public enum BiscuitType {
    PILOTA(20), OREO(20), HIT(32);

    private int gramAmount;

    BiscuitType(int gramAmount) {
        this.gramAmount = gramAmount;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public void setGramAmount(int gramAmount) {
        this.gramAmount = gramAmount;
    }
}
