package dynamicjdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabase {
	private static final String createDB = "CREATE DATABASE User";

	public static void main(String[] avg) throws SQLException, ClassNotFoundException {
		Createdatabase createdatabase = new Createdatabase();
		createdatabase.createDb();
	}

	public void createDb() throws SQLException, ClassNotFoundException {
		System.out.println(createDB);
		try (Connection connection = Dbconnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(createDB);
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
