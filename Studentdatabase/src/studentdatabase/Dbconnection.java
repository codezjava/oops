package studentdatabase;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	public static final String DRIVER_ClASS = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;

		Class.forName(DRIVER_ClASS);
		try {
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
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
