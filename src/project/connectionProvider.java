package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sol
 */
public class connectionProvider {
   public static Connection getCon() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        return connection;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
    
}