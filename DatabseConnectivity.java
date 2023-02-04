import java.sql.DriverManager;
import java.sql.*;
public class DatabseConnectivity {
    public static void main(String[] args) throws Exception{
        String connectionURL = "jdbc:mysql://local:3306/mart";
        Class.forName("com.mysql://localhost:3306/mart");
        Connection conn = DriverManager.getConnection(connectionURL);
        System.out.println("Connected to Server !!!");
        conn.close();
    }
}
