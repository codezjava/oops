package employeedb;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Empupdatestatement {
	private static final String Empupdatequery = "update employees.emp set staff_name= ? where staff_id= ? ;";

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		Empupdatestatement empupdate = new Empupdatestatement();
		empupdate.updateQuery();
	}

	public  void updateQuery() throws SQLException, ClassNotFoundException {
		System.out.println(Empupdatequery);
		try (Connection connection = EmpConnection.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(Empupdatequery)) {
			preparedstatement.setString(1, "anandhi");
			preparedstatement.setInt(2, 33);
			preparedstatement.executeUpdate();

		} catch (SQLException e) {
			EmpConnection.printException(e);
		}
	}
}
