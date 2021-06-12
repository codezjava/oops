package population2;

import java.util.Scanner;

class Salary {
	void salaryDetails() {

		int n;
		Scanner in = new Scanner(System.in);
		{
			n = in.nextInt();

			switch (n) {
			case 1: {
				System.out.println("Salary = 100000");
				break;
			}
			case 2: {
				System.out.println("Salary = 50000");
				break;
			}
			case 3: {
				System.out.println("Salary = 40000");
				break;
			}
			}
			in.close();
		}
	}
}

public class Example extends Salary {
	public static void main(String arg[]) {
		Salary s = new Salary();
		String na;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Salary details--------");
		System.out.println("Enter your name");
		na = sc.nextLine();
		System.out.println("-------------------------");
		System.out.println("\t1.hr");
		System.out.println("\t2.manager");
		System.out.println("\t3.team leader");
		System.out.println("--------------------------");
		String pos;
		System.out.println("Enter your position");
		pos = sc.nextLine();
		s.salaryDetails();
		sc.close();

	}
}
