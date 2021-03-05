package jdbc.generatedid;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {


    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public long createEmployee(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES (?)",
                        Statement.RETURN_GENERATED_KEYS)
        ) {
            stmt.setString(1, name);
            stmt.executeUpdate();
            return getIdByStatement(stmt);

        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert", se);
        }
    }

    private long getIdByStatement(PreparedStatement stmt) { //  throws SQLException {
        try (
                ResultSet rs = stmt.getGeneratedKeys()
        ) {
            if (rs.next()) {
                return rs.getLong(1);
            }
            throw new IllegalStateException("Can not get id");
        }
        catch (SQLException se) {
            throw new IllegalStateException("can not get id", se );
        }
    }


    public List<String> listEmployeeNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        } catch (SQLException se) {
            throw new IllegalStateException("Can not select employees", se);
        }
    }


    public String findEmployeeNameById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select emp_name from employees where id = ?")
        ) {
            stmt.setLong(1, id);
            return selectNameByPreparedStatement(stmt);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query", se);
        }
    }

    private String selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                return name;
            }
            throw new IllegalArgumentException("Not found");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query ", se);
        }
    }

}
