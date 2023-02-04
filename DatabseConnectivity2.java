import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbconnection {
    public static void main(String[] args) throws Exception {
        try{
//            String connectionURL = "jdbc:mysql://local:3306/mart";
//            Class.forName("com.mysql://localhost:3306/mart");
//            Connection conn = DriverManager.getConnection(connectionURL,"root","1234");
            int bid=102;
            String bookTitle ="Sql Essentials";
            String author ="Jerry Rig";
            int price =295;

            String insertQuery=String.format("insert into books values(%d,'%s','%s','%d')",bid,bookTitle,author,price);
            System.out.println(insertQuery);
//            Statement stmt =conn.createStatement();
//            stmt.execute(insertQuery);
//            stmt.close();
//            conn.close();
        }catch (Exception e){

        }
    }
}
