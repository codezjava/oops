package Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Update PreparedStatement JDBC Example
 * @author Krishnan
 *
 */
public class UpdateStatement {

    private static final String UPDATE_USERS_SQL = "update employee set employee_name = ? where employee_id = ?;";

    public static void main(String[] argv) throws SQLException, ClassNotFoundException {
        UpdateStatement updatestatement = new UpdateStatement();
        updatestatement.updateRecord();
    }

    public void updateRecord() throws SQLException, ClassNotFoundException {
        System.out.println(UPDATE_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DBConnection.getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setString(1, "Mega John");
            preparedStatement.setInt(2, 4);

            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
        	DBConnection.printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }
}
