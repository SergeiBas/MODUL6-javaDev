package connection;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public final static String DB_URL = "";
    public final static String DB_USER = "";
    public final static String DB_PASSWORD = "";
    private static final Logger LOGGER = LoggerFactory.getLogger(DataBase.class);
    private static DataBase instance;
    private static Connection CONNECTION;

    private DataBase() {
        BasicConfigurator.configure();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            LOGGER.error("Don`t have a db driver!", e);
        }
        try {
            CONNECTION = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            LOGGER.info("Connection is successful");
        } catch (SQLException e) {
            LOGGER.error("Connection problem..", e);
        }
    }

    public static synchronized DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public static Connection getConnection() {
        return CONNECTION;
    }

}