import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root";
        String password = "password";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String insertQuery = "INSERT INTO students (id, name) VALUES (?, ?)";
            try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                insertStmt.setInt(1, 1);
                insertStmt.setString(2, "Alice");
                insertStmt.executeUpdate();
                System.out.println("Record inserted successfully.");
            }
            String updateQuery = "UPDATE students SET name = ? WHERE id = ?";
            try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
                updateStmt.setString(1, "Alice Updated");
                updateStmt.setInt(2, 1);
                updateStmt.executeUpdate();
                System.out.println("Record updated successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

