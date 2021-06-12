package shopjdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class ShopConnection {
	public static final String Driver_class = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String Username = "root";
	public static final String Password = "";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName(Driver_class);
		try {
			connection = DriverManager.getConnection(URL, Username, Password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

	public static void printShopException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("cause: " + t);
					t = t.getCause();
				}

			}

		}
	}
}
