package shopjdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ShopInsertStatement {

	private static final String Shop_Insert = " insert into shop.workes" + "(workes_id,workes_name,email,city)VALUES"
			+ "(?,?,?,?);";

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		ShopInsertStatement shopinsert = new ShopInsertStatement();
		shopinsert.shopinsertRecord();

	}

	public void shopinsertRecord() throws ClassNotFoundException, SQLException {
		System.out.println(Shop_Insert);
		try (Connection connection = ShopConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Shop_Insert)) {
			preparedStatement.setInt(1, 99);
			preparedStatement.setString(2, "sineka");
			preparedStatement.setString(3, "sineka@gamil.com");
			preparedStatement.setString(4, "karaikal");

			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			ShopConnection.printShopException(e);
		}
	}
}
