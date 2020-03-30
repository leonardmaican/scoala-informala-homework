package sci;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The tool I used to connect to the database
 */

public class Connector {

    public static void main(String[] args) throws SQLException {
        Connection myConnection = connect("mysql", "localhost", "3306", "sci", "root", "admin");
        myConnection.close();
    }

    public static Connection connect(String type, String host, String port, String dbName, String user, String pw) {
        Connection conn = null;
        DriverManager.setLoginTimeout(60);
        try {

            String url = "jdbc:" +
                    type +    // “mysql” / “db2” / “mssql” / “oracle” / ...​

                    "://" +
                    host +
                    ":" +
                    port +
                    "/" +
                    dbName +
                    "?user=" +
                    user +
                    "&password=" +
                    pw;

            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {

            System.err.println("Cannot connect to the database: " + e.getMessage());

        }
        return conn;

    }

}
