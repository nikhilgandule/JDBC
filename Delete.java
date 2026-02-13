import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
    private static final String url ="jdbc:mysql://localhost:3306/stud";

    private static final String username ="root";
    private static final String password ="1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to delete record from database");
        int id = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            String q = String.format("Delete from stud where id = %d",id);
            int row = stmt.executeUpdate(q);
            if (row>0){
                System.out.println("Record Deleted");
            }else{
                System.out.println("Not Deleted");
            }
            stmt.close();
            con.close();
            sc.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
