import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Soumya@3002#";

        String query = "INSERT INTO Student (name, department) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, "Anu");
            ps.setString(2, "ECE");

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ Data inserted successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}