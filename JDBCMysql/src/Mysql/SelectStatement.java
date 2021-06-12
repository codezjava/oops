package Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Select SelectStatement JDBC Example
 * 
 * @author Krishnan
 *
 */
public class SelectStatement {
    private static final String QUERY = "select * from employee";

    public static void main(String[] args) throws ClassNotFoundException {

        // using try-with-resources to avoid closing resources (boiler plate code)

        // Step 1: Establishing a Connection
        try (Connection connection = DBConnection.getConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
            //preparedStatement.setInt(1, 1);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                String father = rs.getString("father_name");
                String dept = rs.getString("department");
                String staff = rs.getString("staff_type");
                System.out.println(id + "," + name + "," + father + "," + dept + "," + staff);
            }
        } catch (SQLException e) {
        	DBConnection.printSQLException(e);
        }
        // Step 4: try-with-resource statement will auto close the connection.
    }
}
