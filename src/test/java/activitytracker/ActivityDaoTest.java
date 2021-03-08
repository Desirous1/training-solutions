package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init(){
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
        Flyway flyway = Flyway.configure()
                .locations("/db/migration/activitytracker")
                .dataSource(dataSource)
                .load();

        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void testInsertElement(){
        //Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Biking in Zemplén", ActivityType.BIKING);
        //activityDao.insertActivity(activity);
        assertEquals(activityDao.selectAllActivities().size(), 3);
    }

    @Test
    public void testSelectByType(){
        assertEquals(1, activityDao.selectActivitiesByType(ActivityType.BIKING).size());
    }

}