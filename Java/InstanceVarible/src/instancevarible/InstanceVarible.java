package instancevarible;

class Employee {
	int rollNo;
	String name;
	double salary;

	static String place;
}

public class InstanceVarible {
	public static void main(String[] arg) {
		Employee.place="chennai";

		Employee e1 = new Employee();
		e1.rollNo = 001;
		e1.name = "nandhini";
		e1.salary = 50000;

		System.out.println(e1.rollNo);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(Employee.place);

		Employee e2 = new Employee();
        e2.rollNo = 002;
		e2.name = "deva";
		e2.salary = 60000;

		System.out.println(e2.rollNo);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(Employee.place);

		Employee e3 = new Employee();
        e3.rollNo = 003;
		e3.name = "deva";
		e3.salary = 60000;

		System.out.println(e3.rollNo);
		System.out.println(e3.name);
		System.out.println(e3.salary);
		System.out.println(Employee.place);
		
		System.out.println(Employee.place);
	}
}
