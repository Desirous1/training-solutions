package classstructureconstructors;

public class Book {

    private String author;
    private String title;
    private String regNumber;

    public void register(String regNumber) {
        this.author = "Valaki Jó";
        this.title = "Olvasható írás";
        this.regNumber = regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
