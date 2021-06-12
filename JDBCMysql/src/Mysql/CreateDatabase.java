package Mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Create Statement JDBC Example
 * @author Krishnan
 *
 */
public class CreateDatabase {

    private static final String createTableSQL = "CREATE DATABASE Viji";

    public static void main(String[] argv) throws SQLException, ClassNotFoundException {
        CreateDatabase createDatabase = new CreateDatabase();
        createDatabase.createDB();
    }

    public void createDB() throws SQLException, ClassNotFoundException {

        System.out.println(createTableSQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DBConnection.getConnection();
            // Step 2:Create a statement using connection object
            Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(createTableSQL);
        } catch (SQLException e) {

            // print SQL exception information
        	DBConnection.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
