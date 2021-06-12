import java.util.*;

class Employee {
	private int Rollno;
	private String Empname;
	private float Salary;

	public String getEmpname() {
		return Empname;

	}

	public int getRollno() {
		return Rollno;
	}

	public void setName(String Empname) {
		this.Empname = Empname;
	}

	public void setRollno(int Rollno) {
		this.Rollno = Rollno;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(float Salary) {
		this.Salary = Salary;
	}

	public void output() {
		System.out.println("\n----\"Employee Details\"----");
		System.out.println("\tEmployree name:=" + getEmpname());
		System.out.println("\tEmployee rollno:=" + getRollno());
		System.out.println("\tEmployee Salary:=" + getSalary());

	}
}

public class Collection40 {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name");
		String Empname = sc.nextLine();
		System.out.println("Enter the Employee rollno");
		int Rollno = sc.nextInt();
		System.out.println("Enter the Employee Salary");
		float Salary = sc.nextFloat();
		Employee e = new Employee();
		e.setName(Empname);
		e.setRollno(Rollno);
		e.setSalary(Salary);
		e.output();
		sc.close();

	}

}
