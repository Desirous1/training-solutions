package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();

        note.setName("Petőfi Sándor");
        note.setTopic("Versek");
        note.setText("Talpra Magyar, Anyám tyúkja");
        System.out.println(note.getNoteText(note.getName(), note.getTopic(), note.getText()));
    }
}
