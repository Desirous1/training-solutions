package week04d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Invalid name: [" + fullName + "]!");
        }
        this.fullName = fullName;
    }

    public String changeFirstName(String paraFirstName) {

        return paraFirstName + fullName.substring(fullName.indexOf(" "));
    }

    @Override
    public String toString() {
        return "fullName = '" + fullName + '\'';
    }
}
