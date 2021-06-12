import java.util.Scanner;

public class Examples2 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = Integer.MAX_VALUE;
		System.out.println("Enter number to chech if prime of not");
		while(n!=0) {
			n=s.nextInt();
			System.out.printf("dose %d is prime? %s %s %n" ,n,isprime(n),isPrimeOrNot(n));
		}

	}

	public static boolean isprime(int n) {
		int sqrt = (int) Math.sqrt(n) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

		public static String isPrimeOrNot(int num) {
		if (num < 0) {
			return "not valid";
		}
		if (num == 0 || num == 1) {
			return "not prime";

		}
		if (num == 2 || num == 3) {
			return "prime number";
		}
		if ((num * num - 1) % 24 == 0) {
			return "prime";

		} else {
			return "not prime";
		}
	}
}
