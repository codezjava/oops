package persondatabase;

public class Person implements java.io.Serializable {
	private int personId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String phone;

	public int getpersonId() {
		return personId;
	}

	public void setpersonId(int personId) {
		this.personId = personId;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setmiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getmiddleName() {
		return middleName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getemail() {
		return email;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	public String getphone() {
		return phone;
	}

}
