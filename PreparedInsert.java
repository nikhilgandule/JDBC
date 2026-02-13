import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsert {
    private static final String url ="jdbc:mysql://localhost:3306/stud";
    private static final String username ="root";
    private static final String password="1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter mark");
        int mark = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement stmt = con.prepareStatement("insert INTO stud (id,name,age,mark) values(?,?,?,?)");

            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setInt(3,age);
            stmt.setInt(4,mark);

            int row = stmt.executeUpdate();
            if (row > 0){
                System.out.println("Record Inserted");
            }else {
                System.out.println("Not Insert");
            }
            stmt.close();
            con.close();
            sc.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
