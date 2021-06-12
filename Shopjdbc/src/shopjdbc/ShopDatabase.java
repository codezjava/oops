package shopjdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ShopDatabase {
	private static final String createdb = "CREATE DATABASE shop";

	public static void main(String arg[]) throws SQLException, ClassNotFoundException {
		ShopDatabase shopdatabase = new ShopDatabase();
		shopdatabase.createdatabase();
	}

	public void createdatabase() throws SQLException, ClassNotFoundException {
		System.out.println(createdb);
		try (Connection connection = ShopConnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(createdb);
		} catch (SQLException e) {
			ShopConnection.printShopException(e);
		}
	}
}
