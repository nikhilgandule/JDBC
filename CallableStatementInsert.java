import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementInsert {

    private static final String url = "jdbc:mysql://localhost:3306/data";
    private static final String username = "root";
    private static final String password = "1234";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id ");
            int id = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter salary");
            double salary = sc.nextDouble();
            System.out.println("Enter city");
            String city = sc.next();

            Connection con = DriverManager.getConnection(url,username,password);
            CallableStatement call = con.prepareCall("{getInfo(?,?,?,?)}");

            call.setInt(1, id);
            call.setString(2, name);
            call.setDouble(3, salary);
            call.setString(4, city);

            int set = call.executeUpdate();
            if(set > 0){
                System.out.println("Data Inserted");
            }else {
                System.out.println("Not insert");
            }
            
            call.close();
            con.close();
            sc.close();
			
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
