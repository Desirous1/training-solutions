package covid19;

public class TValidate {

    public boolean nameVd(String name) {
        if (
                name.length() < 4
        ) {
            System.out.println("A név nem felel meg a követelményeknek, kérem mégegyszer!");
            return false;
        }
        return true;
    }

    public boolean zipVd(String zip) {
        if (zip.length() != 4) {
            System.out.println("Négy karakternél kisebb nem lehet, kérem mégegyszer!");
            return false;
        }

        try {
            int result = Integer.parseInt(zip);
        } catch (NumberFormatException nfe) {
            System.out.println("Betűt nem tartalmazhat, kérem mégegyszer!");
            return false;
        }
        return true;
    }


    public boolean emailVd(String email) {
        String[] emailSplitAt = email.split("@");
        String[] emailSplitDot = email.split(".");
        if (email.length() < 6 || emailSplitAt.length == 1 || emailSplitDot.length == 1) {
            System.out.println("Nem megfelelő formátum!");
            return false;
        }
        return true;
    }

    public boolean email2Vd(String email, String email2) {
        if (!email.equals(email2)) {
            System.out.println("Nem egyezik a két mailcím, kérem mégegyszer!");
            return false;
        }
        return true;
    }

    public boolean tajVd(String taj) {
        try {
            Integer result = Integer.parseInt(taj);
        } catch (NumberFormatException nfe) {
            System.out.println("Betűt nem tartalmazhat, kérem mégegyszer!");
            return false;
        }
        int sum = 0;
        for(int i=0; i<=7; i=i+2) {
            int numb1 = Integer.parseInt(taj.substring(i,i+1));
            int numb2 = Integer.parseInt(taj.substring(i+1,i+2));
            sum = sum+ (numb1 * 3) + (numb2 * 7) ;
        }
        int controll = sum % 10;
        int part = Integer.parseInt(taj.substring(taj.length()-1));
        if (controll != part) {
            System.out.println("Nem megfelelő tAJ szám, kérem mégegyszer!");
            return false;
        }
        return true;
    }

}
