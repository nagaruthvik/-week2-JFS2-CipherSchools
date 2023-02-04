import java.sql.DriverManager;
import java.sql.*;
public class dbConnection2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionURL ="jdbc:mysql://localhost/booksdb";
            Connection conn = DriverManager.getConnection(connectionURL,"root","1234");
            System.out.println("Connected to Server Succesfully!!!");
            Statement stmt = conn.createStatement();
            String selectQuery="select * from books";
            ResultSet result = stmt.executeQuery(selectQuery);
            while(result.next()){
                System.out.println(result.getString(1)+" "+result.getString(2));
            }
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
