
class Employee1 {
	int empid;
	String name;
	static String company = "tech software";

	Employee1(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	void display() {
		System.out.println(empid+"\t"+name+"\t"+company);
	}

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(1, "viji");
		emp1.display();
		Employee1 emp2 = new Employee1(2, "rani");
		emp2.display();
	}
}