package covid19;

import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.SQLException;
import java.util.Scanner;

public class TService {

    private TDao tDao;

    public TService() {
        createDao();

    }

    Scanner scanner = new Scanner(System.in);

    private void createDao() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid19?useUnicode=true");
            dataSource.setUser("doctor");
            dataSource.setPassword("doctor");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
        tDao = new TDao(dataSource);
    }

    TValidate tValidate = new TValidate();

    public void registration() {
        System.out.println("Covid-19 Oltási regisztráció");

        System.out.println("Kérem a nevét!");
        String name;
        do {
            name = scanner.nextLine();
        } while (!tValidate.nameVd(name));
        System.out.println("Megadott név: " + name);

        System.out.println("Kérem lakcíme irányítószámát!");
        String zip;
        do {
            zip = scanner.nextLine();
        } while (!tValidate.zipVd(zip));
        System.out.println(zip + " " + tDao.getZipFromCity(zip));

        System.out.println("Kérem az életkorát");
        int age;
        age = scanner.nextInt();
        scanner.nextLine();
        if (age < 10 || age > 150) {
            System.out.println("Az életkornak 10 évnél nagyobb, 150 évnél kevesebbnek kell lennie!");
            System.out.println("Önt nem kaphat végőoltást");
            return;
        }

        System.out.println("Kérem az email címét!");
        String email;
        do {
            email = scanner.nextLine();
        } while (!tValidate.emailVd(email));

        System.out.println("Kérem ismételje meg az email címét!");
        String email2;
        do {
            email2 = scanner.nextLine();
        } while (!tValidate.email2Vd(email, email2));

        System.out.println("Kérem a TAJ számát!");
        String taj;
        do {
            taj = scanner.nextLine();
        } while (!tValidate.tajVd(taj));

        tDao.createRegistration(name, zip, age, email, taj);
    }

    public void registrationFromCsv() {
    }

    public void generation() {
        System.out.println("Kérem az irányítószámot a generáláshoz!");
        String zip;
        do {
            zip = scanner.nextLine();
        } while (!tValidate.zipVd(zip));
        System.out.println(zip + " " + tDao.getZipFromCity(zip));
        tDao.markingToVaccination(zip);
    }


}
