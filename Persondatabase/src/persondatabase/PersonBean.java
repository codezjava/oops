package persondatabase;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

public class PersonBean {

	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/";
	static final String DB_USER="root";
	static final String DB_PASS="";
	private JdbcRowSet rowSet=null;
	public PersonBean() {
		try {
			Class.forName(JDBC_DRIVER);
			rowSet=new JdbcRowSetImpl();
			rowSet.setUrl(DB_URL);
			rowSet.setUsername(DB_USER);
			rowSet.setPassword(DB_PASS);
			rowSet.setCommand("SELECT * FROM persondb.person");
			rowSet.execute();

			catch(SQLException | ClassNotFoundException ex) {
				ex.printStackTrace();	
			}
		}
		public Person create(Person p) {
			try {
				rowSet.moveToInsertRow();
				rowSet.updateInt("personId",p.getpersonId());
				rowSet.updateString("firstName",p.getfirstName());
				rowSet.updateString("middleName",p.getmiddleName());
				rowSet.updateString("lastName",p.getlastName());
				rowSet.updateString("email",p.getemail());
				rowSet.updateString("phone",p.getphone());
				rowSet.insertRow();
				rowSet.moveToCurrentRow();
			}
			catch(SQLException ex) {
				try {
					rowSet.rollback();
					p=null;
				}catch(SQLException e) {		
				}
				ex.printStackTrace();
			}
			return p;
		}
		public Person update(Person p) {
			try {
				rowSet.updateString("firstName",p.getfirstName());
				rowSet.updateString("middleName",p.getmiddleName());
				rowSet.updateString("lastName",p.getlastName());
				rowSet.updateString("email",p.getemail());
				rowSet.updateString("phone",p.getphone());
				
				rowSet.updateRow();
				rowSet.moveToCurrentRow();
			}
			catch(SQLException ex) {
				try {
					rowSet.rollback();
				}
				catch(SQLException e) {
					
				}
				ex.printStackTrace();
			}return p;
			
		}
		public void delete() {
			try {
				rowSet.moveToCurrentRow();
				rowSet.deleteRow();
			}
			catch(SQLException ex) {
				try {
					rowSet.rollback();
				}catch(SQLException e) {}
				ex.printStackTrace();
			}
		}
		public Person moveFirst() {
			Person p=new Person();
			try {
				rowSet.first();
				p.setpersonId(rowSet.getInt("personId"));
				p.setfirstName(rowSet.getString("firstName"));
				p.setmiddleName(rowSet.getString("middleName"));
				p.setlastName(rowSet.getString("lastName"));
				p.setemail(rowSet.getString("email"));
				p.setphone(rowSet.getString("phone"));
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
			return p;
		}
		
		public Person moveLast() {
			Person p=new Person();
			try {
				rowSet.last();
				p.setpersonId(rowSet.getInt("personId"));
				p.setfirstName(rowSet.getString("firstName"));
				p.setmiddleName(rowSet.getString("middleName"));
				p.setlastName(rowSet.getString("lastName"));
				p.setemail(rowSet.getString("email"));
				p.setphone(rowSet.getString("phone"));
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
			return p;
		}
		public Person moveNext() {
			Person p=new Person();
			try {
				if(rowSet.next()==false)
				rowSet.previous();
				p.setpersonId(rowSet.getInt("personId"));
				p.setfirstName(rowSet.getString("firstName"));
				p.setmiddleName(rowSet.getString("middleName"));
				p.setlastName(rowSet.getString("lastName"));
				p.setemail(rowSet.getString("email"));
				p.setphone(rowSet.getString("phone"));
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
			return p;
		}
		
		public Person movePrevious() {
			Person p=new Person();
			try {
				if(rowSet.previous()==false)
				rowSet.next();
				p.setpersonId(rowSet.getInt("personId"));
				p.setfirstName(rowSet.getString("firstName"));
				p.setmiddleName(rowSet.getString("middleName"));
				p.setlastName(rowSet.getString("lastName"));
				p.setemail(rowSet.getString("email"));
				p.setphone(rowSet.getString("phone"));
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
			return p;
		}
		public Person getCurrent() {
			Person p=new Person();
			try {
				rowSet.moveToCurrentRow();
				p.setpersonId(rowSet.getInt("personId"));
				p.setfirstName(rowSet.getString("firstName"));
				p.setmiddleName(rowSet.getString("middleName"));
				p.setlastName(rowSet.getString("lastName"));
				p.setemail(rowSet.getString("email"));
				p.setphone(rowSet.getString("phone"));
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
			return p;
		}
	}