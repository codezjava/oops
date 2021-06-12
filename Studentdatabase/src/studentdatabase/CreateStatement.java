package studentdatabase;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class CreateStatement {

	private static final String tablequery = "create table Student.studenttable (\r\n"
			+ "  student_id  int(3) primary key,\r\n" + "  student_name varchar(20),\r\n" + "  dept varchar(20),\r\n"
			+ " year  varchar(20),\r\n" + " city varchar(50)\r\n " + " );";

	public static void main(String argv[]) throws SQLException, ClassNotFoundException {
		CreateStatement createTable = new CreateStatement();
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
