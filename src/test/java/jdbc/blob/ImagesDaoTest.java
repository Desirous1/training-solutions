package jdbc.blob;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImagesDaoTest {

    private ImagesDao imagesDao;

    @BeforeEach
    public void init() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");

        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();
        imagesDao = new ImagesDao(dataSource);
    }

    @Test
    public void saveImage() throws IOException {
        imagesDao.saveImages("soha ne add fel.jpg", ImagesDaoTest.class.getResourceAsStream("/soha ne add fel.jpg"));

        ByteArrayOutputStream baoes = new ByteArrayOutputStream();

        try (InputStream is = imagesDao.getImagesByName("soha ne add fel.jpg") ) {
            is.transferTo(baoes);
        }
        System.out.println(baoes.size());
        assertEquals(true, baoes.size() > 9000);
    }

}