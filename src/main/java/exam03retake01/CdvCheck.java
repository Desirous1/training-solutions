package exam03retake01;

public class CdvCheck {

    public boolean check(String adoSzam) {
        if(adoSzam.length()<10) {
            throw new IllegalArgumentException("Nem megfelelő szám");
        }
        try {
              int s=Integer.parseInt(adoSzam);
        } catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Nem tartalmazhat betűt");
        }

        int result = 0;
        for(int i = 0; i<adoSzam.length()-1; i++){
            result = result + (Character.getNumericValue(adoSzam.charAt(i) * i + 1));
        }
        result = result % 11;
        return result == Character.getNumericValue(adoSzam.charAt(adoSzam.length() - 1));
    }
}
