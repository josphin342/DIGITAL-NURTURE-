import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            connection.setAutoCommit(false); 

            String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            try (PreparedStatement debitStmt = connection.prepareStatement(debitQuery);
                 PreparedStatement creditStmt = connection.prepareStatement(creditQuery)) {

                debitStmt.setInt(1, 100);
                debitStmt.setInt(2, 1);
                debitStmt.executeUpdate();

                creditStmt.setInt(1, 100);
                creditStmt.setInt(2, 2);
                creditStmt.executeUpdate();

                connection.commit(); 
                System.out.println("Transaction completed successfully.");
            } catch (Exception e) {
                connection.rollback();
                System.out.println("Transaction failed. Rolled back.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

