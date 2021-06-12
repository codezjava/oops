package jdbc;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Updatestatement {
	private static final String UPDATE_QUERY = "update School.stu set stu_name= ? where id= ? ;";

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		Updatestatement updatestatement = new Updatestatement();
		updatestatement.updateRecord();

	}

	public void updateRecord() throws ClassNotFoundException, SQLException {
		System.out.println(UPDATE_QUERY);
		try (Connection connection = Dbconnection.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(UPDATE_QUERY)) {
			preparedstatement.setString(1, "rani");
			preparedstatement.setInt(2, 34);

			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
