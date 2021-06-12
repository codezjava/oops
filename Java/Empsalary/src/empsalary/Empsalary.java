package empsalary;

class Empdetails {
	String name;
	int reg;
	String po;

	Empdetails(String name, int reg, String po) {
		this.name = name;
		this.reg = reg;
		this.po = po;
	}

	void employeeDetails() {//employee personal details
		System.out.println("------------Employee personal detailes------------\n");
		System.out.println("Employee name:\t" + name);
		System.out.println("Employee reg:\t" + reg);
		System.out.println("Employee position:\t" + po + "\n");

	}
}

class Emsalarycalculation {
	String name;
	long sa;
	Empdetails emp;

	Emsalarycalculation(String name, String n, Empdetails emp) {
		this.name = name;
		this.name = n;
		this.emp = emp;

	}

	void empSalary() {//employee salary details
		String n = "hr";
		System.out.println("---------Employee salary details-----------\n");
		System.out.println("Employee name:\t\t" + emp.name);
		System.out.println("Employee reg:\t\t" + emp.reg);
		System.out.println("Employee position:\t" + emp.po + "\n");

		if (n == "hr") {
			sa = 500000;
			System.out.println("Employee Salary is:\t" + sa);

		} else {
			sa = 50000;
			System.out.println("Employee Salary is:\t" + sa);
		}

	}
}

public class Empsalary {
	public static void main(String arg[]) {
		Empdetails emp = new Empdetails("viji", 101, "hr");
		emp.employeeDetails();
		Emsalarycalculation e2 = new Emsalarycalculation("viji", "hr", emp);
		e2.empSalary();

	}

}
