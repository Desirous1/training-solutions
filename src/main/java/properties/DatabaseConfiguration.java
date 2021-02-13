package properties;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.Properties;

public class DatabaseConfiguration {

    private static final String ENCODING_UTF8 = "UTF-8";
    private Properties config = new Properties();

    //=========
    public DatabaseConfiguration() {
        try (InputStream resource = DatabaseConfiguration.class.getResourceAsStream("/db.properties")
        ) {
            config.load(resource);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    //==========
    public DatabaseConfiguration(File file) {
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
        ) {
            load(fileInputStream);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    //========
    private Properties load(InputStream inputStream) {
        config = new Properties();
        try (
                InputStreamReader reader = new InputStreamReader(inputStream, ENCODING_UTF8);
        ) {
            config.load(reader);
            return config;
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read properties file from inputstream", ioe);
        }
    }

    public String getHost() {
        return config.getProperty("db.host");
    }

    public int getPort() {
        return Integer.parseInt(config.getProperty("db.port"));
    }

    public String getSchema() {
        return config.getProperty("db.schema");
    }


    public static void main(String[] args) {
        DatabaseConfiguration db = new DatabaseConfiguration();
        System.out.println(db.config);
        System.out.println(db.load(DatabaseConfiguration.class.getResourceAsStream("/db.properties")));

        //nem tudom meghívni a File típusú file attribútumot váró konstruktort.

        System.out.println(db.getHost());
        System.out.println(db.getPort());
        System.out.println(db.getSchema());

    }
}
