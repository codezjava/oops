package dynamicjdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.*;

public class Insertrecord {

	private static final String insertQuery = "INSERT INTO User.usertable" + "(user_id,name_name,country,email)VALUES"
			+ "(?, ?, ?, ?); ";

	public static void main(String arg[]) throws SQLException, ClassNotFoundException {
		Insertrecord insertrecord = new Insertrecord();
		insertrecord.insertStatement();
	}

	public void insertStatement() throws SQLException, ClassNotFoundException {
		System.out.println(insertQuery);

		int id;
		System.out.println("enter your user_id");
		Scanner a = new Scanner(System.in);
		id = a.nextInt();

		String name;
		System.out.println("enter your user_name");
		Scanner b = new Scanner(System.in);
		name = b.nextLine();

		String country;
		System.out.println("enter your country");
		Scanner c = new Scanner(System.in);
		country = c.nextLine();

		String email;
		System.out.println("enter your email");
		Scanner d = new Scanner(System.in);
		email = d.nextLine();
		a.close();
		b.close();
		c.close();
		d.close();

		try (Connection connection = Dbconnection.getConnection();

				PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, country);
			preparedStatement.setString(4, email);

			System.out.println(preparedStatement);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			Dbconnection.printException(e);
		}
	}
}
