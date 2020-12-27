package week08d04;

public class Trainer {

private CanMark cm;

    public Trainer(CanMark cm) {
        this.cm = cm;
    }

    public int giveMark() {
       return this.cm.giveMark();
    }

    public static void main(String[] args) {
        Trainer tr = new Trainer(new GoodMood());
        System.out.println(tr.giveMark());
        Trainer tr2 = new Trainer(new BadMood());
        System.out.println(tr2.giveMark());
    }
}
