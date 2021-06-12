package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Insertstatement {

	private static final String INSERT_QUERY = "INSERT INTO school.stu"
			+ "  (stu_id,stu_name, department, staff_name) VALUES " + " (?, ?, ?, ?, ?);";

	public static void main(String argv[]) throws SQLException, ClassNotFoundException {
		Insertstatement createExample = new Insertstatement();
		createExample.insertRecord();
	}

	public void insertRecord() throws SQLException, ClassNotFoundException {
		System.out.println(INSERT_QUERY);

		try (Connection connection = Dbconnection.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(INSERT_QUERY);) {
			preparedstatement.setInt(1, 101);
			preparedstatement.setString(2, "viji");
			preparedstatement.setString(3, "It");
			preparedstatement.setString(4, "rajee");

			System.out.println(preparedstatement);

		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
