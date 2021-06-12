package dynamicjdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {

	private static final String createTableSQL = "create table User.usertable (\r\n"
			+ " user_id  int(3) primary key,\r\n" + " name_name varchar(20),\r\n" + "  country varchar(20),\r\n"
			+ "  email varchar(50)\r\n" + "  );";

	public static void main(String[] argv) throws SQLException, ClassNotFoundException {
		Createtable TableExample = new Createtable();
		TableExample.createTable();
	}

	public void createTable() throws SQLException, ClassNotFoundException {

		System.out.println(createTableSQL);
		// Step 1: Establishing a Connection
		try (Connection connection = Dbconnection.getConnection();
				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement();) {
			statement.execute(createTableSQL);
		} catch (SQLException e) {

			Dbconnection.printException(e);
		}
	}
}
