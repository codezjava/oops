package abstractclass3;

abstract class Bank {
	abstract void salary(long a);

	int a;

	Bank(int a) {
		this.a = a;
		System.out.println("-------Employee Details-------");
		System.out.println("roll:" + a);
	}

	void bankDetails(String bk) {
		System.out.println("Bank name" + bk);
	}
}

	class Employee extends Bank {

		Employee(String a) {
			super(2);
			System.out.println("name:" + a);
		}

		long s;

		void salary(long a) {
			this.s = a;
			System.out.println("Salary:" + s);
		}

	}

public class Abstractclass3 {
	public static void main(String arg[]) {
		Employee e = new Employee("viji");
		e.salary(50000);
	}
}
