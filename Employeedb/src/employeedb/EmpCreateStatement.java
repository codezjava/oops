package employeedb;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class EmpCreateStatement {
	private static final String emptablequery = "create table employees.emp (\r\n" + "  staff_id  int(3) primary key,\r\n"
			+ "  staff_name varchar(20),\r\n" + "  position varchar(20),\r\n" + "  city varchar(20)\r\n" + "  );";

	public static void main(String argv[]) throws SQLException, ClassNotFoundException {
		EmpCreateStatement createTableemp = new EmpCreateStatement();
		createTableemp.createTable();
	}

	public void createTable() throws SQLException, ClassNotFoundException {
		System.out.println(emptablequery);
		try (Connection connection = EmpConnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(emptablequery);
		} catch (SQLException e) {
			EmpConnection.printException(e);
		}
	}
}
