package prime;

import java.util.Scanner;

public class prime {
	public static void main(String args[]) {
		int temp, i;
		boolean isprime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check for prime");
		int num = scan.nextInt();
		if (num > 1) {
			for (i = 2; i < num; i++) {
				temp = num % i;
				if (temp == 0) {
					isprime = false;
					break;
				} else {
					isprime = true;

				}
			}
			if (isprime)
				System.out.println(+num + "is a prime number");
			else
				System.out.println(+num + "is not a prime number");
		} else

			System.out.println(+num + "is not prime number");
	}
}
