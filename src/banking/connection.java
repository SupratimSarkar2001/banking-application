package banking;

import java.sql.Connection;
import java.sql.DriverManager;
// Global connection Class -- Connection Factory
public class connection {
    static Connection con;
    public static Connection getConnection()
    {
        try {
            String url
                    = "jdbc:mysql://localhost:3306/bank";
            String user = "root";
            String password = "supratim8";
            con = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }

        return con;
    }
}

