package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public final static String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	public final static String DB_URL = "jdbc:mysql://localhost:3306/";
	public final static String DB_USERNAME = "root";
	public final static String DB_PASSWORD = "";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		// load the Driver Class
		Class.forName(DB_DRIVER_CLASS);

		try {
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void printSQLException(SQLException ex) {
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
