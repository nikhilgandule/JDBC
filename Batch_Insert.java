import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Batch_Insert {

    private static final String url = "jdbc:mysql://localhost:3306/stud";
    private static final String username = "root";
    private static final String password ="1234";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        try {
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement stmt = con.prepareStatement("insert into stud (id, name, age, mark) values(?, ? ,? ,? )");
            while (true){
                System.out.print("Enter id: ");
                int id = sc.nextInt();
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                System.out.print("Enter mark: ");
                int mark = sc.nextInt();

                stmt.setInt(1,id);
                stmt.setString(2,name);
                stmt.setInt(3,age);
                stmt.setInt(4,mark);
                stmt.addBatch();
                System.out.print("Add more data (Y/N)");
                String ch = sc.next();
                if(ch.equalsIgnoreCase("N")){
                    break;
                }
            }
            int[] result = stmt.executeBatch();
            System.out.println("\nBatch Insert Result:");
            for (int x : result) {
                System.out.println(x + " row inserted");
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
