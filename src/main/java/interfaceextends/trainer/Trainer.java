package interfaceextends.trainer;

public class Trainer implements HasNameAndAge {

    private  String name;

    private int age;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
