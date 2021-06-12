package dynamicjdbc;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selectuserstatement {
	private static final String Query = "SELECT * from User.usertable";

	public static void main(String arg[]) throws SQLException, ClassNotFoundException {
		try (Connection connection = Dbconnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Query);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("user_id");
				String name = rs.getString("name_name");
				String country = rs.getString("country");
				String email = rs.getString("email");
				System.out.println(id + ", " + name + ", " + country + ", " + email + ", ");
			}
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
