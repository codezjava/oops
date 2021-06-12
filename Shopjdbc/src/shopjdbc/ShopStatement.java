package shopjdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ShopStatement {
	private static final String createTable = "create table shop.workes(\r\n" + " workes_id int(3) primary key,\r\n"
			+ " workes_name VARCHAR(50),\r\n" + " email VARCHAR(100),\r\n" + "city VARCHAR(50)\r\n" + ");";

	public static void main(String arg[]) throws SQLException, ClassNotFoundException {
		ShopStatement createtableEx = new ShopStatement();
		createtableEx.createShopTable();
	}

	public void createShopTable() throws SQLException, ClassNotFoundException {
		System.out.println(createTable);
		try (Connection connection = ShopConnection.getConnection();

				Statement statement = connection.createStatement();) {
			statement.execute(createTable);
		} catch (SQLException e) {
			ShopConnection.printShopException(e);
		}

	}

}
