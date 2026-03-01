import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

       
String url = "jdbc:mysql://localhost:3306/db?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Soumya@3002#";

        try {
            
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            
            Statement stmt = conn.createStatement();

            
            String query = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(query);

            
            while (rs.next()) {
                int id = rs.getInt("id");        
                String name = rs.getString("name"); 

                System.out.println("ID: " + id + ", Name: " + name);
            }

            

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}