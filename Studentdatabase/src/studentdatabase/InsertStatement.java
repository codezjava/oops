package studentdatabase;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class InsertStatement {

	private static final String INSERT_QUERY = "INSERT INTO school.stu"
			+ "  (stu_id,stu_name, department, staff_name) VALUES " + " (?, ?, ?, ?, ?);";

	public static void main(String argv[]) throws SQLException, ClassNotFoundException {
		InsertStatement createExample = new InsertStatement();
		createExample.insertRecord();
	}

	public void insertRecord() throws SQLException, ClassNotFoundException {
		System.out.println(INSERT_QUERY);

		try (Connection connection = Dbconnection.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(INSERT_QUERY);) {
			preparedstatement.setInt(1, 101);
			preparedstatement.setString(2, "viji");
			preparedstatement.setString(3, "It");
			preparedstatement.setString(4, "3rd year");
			preparedstatement.setString(5, "karaikal");
			
			
			preparedstatement.setInt(1, 102);
			preparedstatement.setString(2, "rani");
			preparedstatement.setString(3, "ece");
			preparedstatement.setString(4, "2nd year");
			preparedstatement.setString(5, "neravy");
			System.out.println(preparedstatement);

		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
