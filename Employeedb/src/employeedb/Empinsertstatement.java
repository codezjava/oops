package employeedb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Empinsertstatement {
	private static final String EMP_INSERT_QUERY = "INSERT INTO employees.emp"
			+ "  (staff_id,staff_name, position, city) VALUES " + " (?, ?, ?, ?, ?);";

	public static void main(String argv[]) throws SQLException, ClassNotFoundException {
		Empinsertstatement createExample = new Empinsertstatement();
		createExample.insertRecord();
	}

	public void insertRecord() throws SQLException, ClassNotFoundException {
		System.out.println(EMP_INSERT_QUERY);

		try (Connection connection = EmpConnection.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(EMP_INSERT_QUERY);) {
			preparedstatement.setInt(1, 10);
			preparedstatement.setString(2, "kogi");
			preparedstatement.setString(3, "hr");
			preparedstatement.setString(4, "karaikal");

			preparedstatement.setInt(1, 11);
			preparedstatement.setString(2, "viji");
			preparedstatement.setString(3, "tl");
			preparedstatement.setString(4, "kkl");

			System.out.println(preparedstatement);

		} catch (SQLException e) {
			EmpConnection.printException(e);
		}
	}
}
