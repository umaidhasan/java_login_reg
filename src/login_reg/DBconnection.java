
package login_reg;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {
    public static Connection getDBconnection()
    {
        Connection connection;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","");
            return connection;
        }
        catch(Exception ex){
            return null;
        }
    }
}
