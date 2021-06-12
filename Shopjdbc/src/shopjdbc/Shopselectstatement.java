package shopjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Shopselectstatement {

	private static final String selectQuery = "select * from shop.workes;";

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		try (Connection connection = ShopConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);) {
			System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("workes_id");
				String name = rs.getString("workes_name");
				String email = rs.getString("email");
				String city = rs.getString("city");
				System.out.println(id + "," + name + "," + email + "," + city);
			}
		} catch (SQLException e) {
			ShopConnection.printShopException(e);
		}
	}
}
