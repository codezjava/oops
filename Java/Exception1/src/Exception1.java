import java.util.Scanner;

public class Exception1 {
	static int add(int n1, int n2) {
		if (n1 > 500) {
			throw new ArithmeticException("Number 1 is greater than 500 and hencce Exception is thrown");
		} else {
			System.out.println("both parameters are correct....");
		}
		return n1 + n2;
	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2:");
		int n2 = sc.nextInt();
		int result = add(n1, n2);
		System.out.println("Result is" + result);
	}

}
