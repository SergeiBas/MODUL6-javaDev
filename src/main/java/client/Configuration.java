package client;

public class Configuration {
    public final String DB_URL = "jdbc:h2:tcp://localhost/~/test";
    public final String DB_USER = "sa";
    public final String DB_PASSWORD = "";

    public String getDB_URL() {
        return DB_URL;
    }

    public String getDB_USER() {
        return DB_USER;
    }

    public String getDB_PASSWORD() {
        return DB_PASSWORD;
    }
}
