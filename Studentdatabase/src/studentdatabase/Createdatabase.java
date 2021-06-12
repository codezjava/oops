package studentdatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabase {
	private static final String createdatabase = "CREATE DATABASE Student";

	public static void main(String arg[]) throws SQLException, ClassNotFoundException {
		Createdatabase createdatabase = new Createdatabase();
		createdatabase.createDb();
	}

	public static void createDb() throws SQLException, ClassNotFoundException {
		System.out.println(createdatabase);
		try (Connection connection = Dbconnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(createdatabase);
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
