package jdbc;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Deletestatement {

	private static final String DELETE_QUERY = "delete from School.stu where stu_id=?;";

	public static void main(String arg[]) throws SQLException, ClassNotFoundException {
		System.out.println(DELETE_QUERY);

		try (Connection connection = Dbconnection.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(DELETE_QUERY)) {
			preparedstatement.setInt(2, 5);

			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
