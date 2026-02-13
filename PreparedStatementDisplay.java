import java.sql.*;

public class PreparedStatementDisplay {
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
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement stmt = con.prepareStatement("select id,name,age,mark from stud");

            ResultSet set = stmt.executeQuery();

            while (set.next()){
                System.out.println("\nId      :"+set.getInt("id"));
                System.out.println("Name    :"+set.getString("name"));
                System.out.println("Age     :"+set.getInt("age"));
                System.out.println("Mark    :"+set.getInt("mark"));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
