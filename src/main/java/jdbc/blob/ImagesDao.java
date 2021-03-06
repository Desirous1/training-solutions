package jdbc.blob;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class ImagesDao {
    private DataSource dataSource;

    public ImagesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveImages(String filename, InputStream is) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into images(filename, content) value (?, ?)")
        ) {
            ps.setString(1, filename);
            Blob blob = conn.createBlob();

            fillBlob(is, blob);
            ps.setBlob(2, blob);
            ps.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Can not insert image", se);
        }
    }


    public InputStream getImagesByName(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select content from images where filename = ?")
        ) {
            stmt.setString(1, name);
            return readInputStreamFromStatement(stmt);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not read image", se);
        }
    }

    private InputStream readInputStreamFromStatement(PreparedStatement stmt) throws SQLException {
        try (
                ResultSet rs = stmt.executeQuery()
        ) {
            if (rs.next()) {
                Blob blob = rs.getBlob("content");
                return blob.getBinaryStream();
            }
            throw new IllegalStateException("not found");
        }
    }


    private void fillBlob(InputStream is, Blob blob) throws SQLException {
        try (OutputStream os = blob.setBinaryStream(1)) {
            is.transferTo(os);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write blob", ioe);
        }
    }

}
