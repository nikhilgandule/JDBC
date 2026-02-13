import java.sql.*;
public class Insert {

    private static final String url="jdbc:mysql://localhost:3306/stud";
    private static final String username ="root";
    private static final String password ="1234";

    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();

            String q = String.format("insert into stud (id,name,age,mark)values(%d,'%s',%d,%d)",2,"Time",36,62);
            int row = stmt.executeUpdate(q);

            if(row >0){
                System.out.println("Inserted");
            }else{
                System.out.println("Not insert");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
