package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabase {

	private static final String createTable = "CREATE DATABASE School";

	public static void main(String[] argv) throws SQLException, ClassNotFoundException {
		Createdatabase createdb = new Createdatabase();
		Createdatabase.createDB();
	}

	public static void createDB() throws SQLException, ClassNotFoundException {
		System.out.println(createTable);
		try (Connection connection = Dbconnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(createTable);
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}

	}
}
