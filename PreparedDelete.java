import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDelete {

    private static final String url = "jdbc:mysql://localhost:3306/stud";
    private static final String username = "root";
    private static final String password = "1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id to delete record in database");
        int id = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement stmt = con.prepareStatement("Delete from stud where id = ?");

            stmt.setInt(1,id);
            int set = stmt.executeUpdate();
            if(set > 0){
                System.out.println("Record Deleted");
            }else {
                System.out.println("Not Deleted");
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
