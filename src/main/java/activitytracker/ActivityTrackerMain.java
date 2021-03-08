package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {



    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Biking in Zemplén", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Hiking in Zemplén", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Running in Zemplén", ActivityType.RUNNING);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        ActivityDao activityDao = new ActivityDao(dataSource);
//        activityDao.insertActivity( activity);
//        activityDao.insertActivity( activity2);
//        activityDao.insertActivity( activity3);
        System.out.println(activityDao.selectById(4));
        System.out.println(activityDao.selectAllActivities());
        System.out.println(activityDao.selectActivitiesByType((ActivityType.BIKING)));


    }
}