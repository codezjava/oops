package jdbc;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Createstatement {

	private static final String tablequery = "create table school.stu (\r\n" + "  stu_id  int(3) primary key,\r\n"
			+ "  stu_name varchar(20),\r\n" + "  department varchar(20),\r\n" + "  staff_name varchar(20)\r\n" + "  );";

	public static void main(String argv[]) throws SQLException, ClassNotFoundException {
		Createstatement createTable = new Createstatement();
		createTable.createTable();
	}

	public void createTable() throws SQLException, ClassNotFoundException {
		System.out.println(tablequery);
		try (Connection connection = Dbconnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(tablequery);
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
