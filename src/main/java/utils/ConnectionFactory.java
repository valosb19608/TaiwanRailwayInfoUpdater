package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.apache.logging.log4j.LogManager.ROOT_LOGGER_NAME;

public class ConnectionFactory {
    private final static Logger logger = org.apache.logging.log4j.LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    private static DataSource dataSources = new ComboPooledDataSource();

    public static DataSource getDataSources() {
        return dataSources;
    }

    public static Connection getConnenection() {
        try {
            return dataSources.getConnection();
        } catch (SQLException e) {
            logger.error("Connection ERROR When Get Conn From Pool: " + e, e);
        }
        return null;
    }

    public static void close(Connection conn, Statement statement, ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
            if (statement != null)
                statement.close();
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            logger.error("Connection ERROR When Close: " + e, e);
        }
    }
}
