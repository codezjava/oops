package employeedb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpCreatedatabase {

	private static final String createempTable = "CREATE DATABASE employees";

	public static void main(String[] argv) throws SQLException, ClassNotFoundException {
		EmpCreatedatabase createempdb = new EmpCreatedatabase();
		EmpCreatedatabase.createDbemp();
	}

	public static void createDbemp() throws SQLException, ClassNotFoundException {
		System.out.println(createempTable);
		try (Connection connection = EmpConnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(createempTable);
		} catch (SQLException e) {
			EmpConnection.printException(e);
		}

	}
}
