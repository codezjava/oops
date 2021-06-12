package printstatement;

import java.util.Scanner;

class Example {
	void sum() {
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("sum of these numbers: " + sum);

	}
	

	void mul() {
		float m1, m2, ans;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the first value");
		m1 = sc1.nextFloat();
		System.out.println("Enter the second value");
		m2 = sc1.nextFloat();
		ans = m1 * m2;
		System.out.println("the output is:" + ans);

	}

	void sub() {
		double d1, d2, val;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter First number");
		d1 = sc2.nextDouble();
		System.out.println("Enter second number");
		d2 = sc2.nextDouble();
		val = d1 - d2;
		System.out.println("sum of these numbers: " + val);
		sc2.close();

	}
	
	

}

public class PrintStatment {
	public static void main(String[] arg) {
		Example e1 = new Example();
		e1.sum();
		e1.mul();
		e1.sub();

	
		
	}
}
