package interfacerules;

public class Trainer implements HasName, CanWork{

    private String name;

    @Override
    public void doWork() {
    }

    @Override
    public String getName() {
        return name;
    }
}
