package week05d02;

public class ChangeLetter {
    
    private String[] ukVowel = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};

    public String changeVowels(String paraText) {
        for (String i : ukVowel) {
            paraText = paraText.replace(i, "*");
        }
        return paraText;
    }

    public static void main(String[] args) {
        ChangeLetter changeLetter = new ChangeLetter();
        System.out.println(changeLetter.changeVowels("Szívok, mint a torkos borz evvel a javaval!"));
    }
}
