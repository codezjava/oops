package Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Insert PrepareStatement JDBC Example
 * 
 * @author Krishnan
 *
 */
public class InsertStatement {
    private static final String INSERT_USERS_SQL = "INSERT INTO viji.employee" +
        "  (employee_id,employee_name, father_name, department, staff_type) VALUES " +
        " (?, ?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException, ClassNotFoundException {
        InsertStatement createTableExample = new InsertStatement();
        createTableExample.insertRecord();
    }

    public void insertRecord() throws SQLException, ClassNotFoundException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DBConnection.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {           
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Little John");
            preparedStatement.setString(3, "John");
            preparedStatement.setString(4, "IT");
            preparedStatement.setString(5, "Senior");

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
        	DBConnection.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
