package covid19;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TDao {

    private DataSource dataSource;

    public TDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createRegistration(String name, String zip, int age, String mail, String taj) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO citizens(citizen_name, zip, age, email, taj) VALUES (?,?,?,?,?)")
        ) {
            stmt.setString(1, name);
            stmt.setString(2, zip);
            stmt.setInt(3, age);
            stmt.setString(4, mail);
            stmt.setString(5, taj);
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
        System.out.println("Adatrögzítés sikeres");
    }

    public String getZipFromCity(String paraZip) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT city FROM cities WHERE zip = ?");
        ) {
            stmt.setString(1, paraZip);
            return getCityByZipFromCitiesTable(stmt);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query", se);
        }
    }

    private String getCityByZipFromCitiesTable(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                String city = rs.getString("city");
                return city;
            }
            throw new IllegalArgumentException("Not found");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query ", se);
        }
    }

    public String markingToVaccination(String paraZip) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM citizens where zip=? order by number_of_vaccination desc " );
        ) {
            stmt.setString(1, paraZip);
            ResultSet rs = stmt.executeQuery();
            if (rs.wasNull()){
                System.out.println("nulla");
                return null;
            }
            System.out.println("találtam");
            return null;
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query", se);
        }
    }



}