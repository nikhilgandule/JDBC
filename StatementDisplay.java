import java.sql.*;

public class StatementDisplay  {
    private static final String url = "jdbc:mysql://localhost:3306/stud";
    private static final String username ="root";
    private static final String password = "1234";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery("select *from stud");
            while (set.next()){
                int id = set.getInt("id");
                String name = set.getString("name");
                int age = set.getInt("age");
                int mark = set.getInt("mark");

                System.out.println("\nID:     "+id);
                System.out.println("Name:   "+name);
                System.out.println("Age:    "+age);
                System.out.println("Mark:   "+mark);
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
