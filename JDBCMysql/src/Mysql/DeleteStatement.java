package Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Update PreparedStatement JDBC Example
 * @author Krishnan
 *
 */
public class DeleteStatement {

    private static final String DELETE_USERS_SQL = "delete from employee where employee_id = ?;";

    public static void main(String[] argv) throws SQLException, ClassNotFoundException {
        DeleteStatement deleteStatement = new DeleteStatement();
        deleteStatement.updateRecord();
    }

    public void updateRecord() throws SQLException, ClassNotFoundException {
        System.out.println(DELETE_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DBConnection.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL)) {
            preparedStatement.setInt(1, 4);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
        	DBConnection.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
