package Mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Create Statement JDBC Example
 * @author Krishnan
 *
 */
public class CreateStatement {

    private static final String createTableSQL = "create table viji.employee (\r\n" + "  employee_id  int(3) primary key,\r\n" +
        "  employee_name varchar(20),\r\n" + "  father_name varchar(20),\r\n" + "  department varchar(20),\r\n" +
        "  staff_type varchar(20)\r\n" + "  );";

    public static void main(String[] argv) throws SQLException, ClassNotFoundException {
        CreateStatement createTableExample = new CreateStatement();
        createTableExample.createTable();
    }

    public void createTable() throws SQLException, ClassNotFoundException {

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
