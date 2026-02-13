import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

    private static final String url = "jdbc:mysql://localhost:3306/stud";
    private static final String username = "root";
    private static final String password = "1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id to Update");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter New Name to update");
        String name = sc.nextLine();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();

            String q = String.format("Update stud set name = '%s' where id = %d",name,id );

            int row = stmt.executeUpdate(q);
            if(row > 0){
                System.out.println("Updated");
            }else {
                System.out.println("Not Updated");
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
