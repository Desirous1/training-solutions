package jdbc.metadata;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetaDataDao {

    private DataSource dataSource;

    public MetaDataDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getTablesNames(){
        try (
                Connection conn = dataSource.getConnection()
                )
        {
            DatabaseMetaData metaData = conn.getMetaData();
            return getTablesNameByMetadata(metaData);
        }
        catch (SQLException se)  {
            throw new IllegalStateException("Can not read table", se);
        }
    }

    private List<String> getTablesNameByMetadata(DatabaseMetaData metaData) throws SQLException {
        try (
                ResultSet rs =  metaData.getTables(null, null, null, null)
        )  {
            List<String> names = new ArrayList<>();
            while(rs.next()){
                String name = rs.getString(3);
                names.add(name);
            }
            return names;
        }
    }

}
