package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	public final static String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public final static String URL = "jdbc:mysql://localhost:3306/";
	public final static String USERNAME = "root";
	public final static String PASSWORD = "";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;

		Class.forName(DRIVER_CLASS);

		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;
	}

	public static void printException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
