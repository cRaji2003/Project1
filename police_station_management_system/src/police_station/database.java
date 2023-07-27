package police_station;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class database 
{
    public static String url = "jdbc:mysql://127.0.0.1:3306/signup";
    public static String driver = "com.mysql.cj.jdbc.Driver";
    public static String username = "Police";
    public static String password = "police123";
 
    public static Connection openConnection()
    {  
        try
        {
            Class.forName(driver);
           Connection conn = (Connection) DriverManager.getConnection(url,username,password);
           return conn;
        }
        catch (ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
}
