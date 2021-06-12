package jdbc;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Selectstatement {
	private static final String selectQuery = "select * from School.stu";

	public static void main(String arg[]) throws ClassNotFoundException {
		try (Connection connection = Dbconnection.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(selectQuery);) {
			System.out.println(preparedstatement);
			ResultSet rs = preparedstatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("stu_id");
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				String staff_name = rs.getString("staff_name");
				System.out.println(id + "," + name + "," + dept + "," + staff_name);
			}
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
