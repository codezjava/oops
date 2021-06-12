import java.util.Scanner;

public class Examples5 {
	public static void main(String arg[]) {
		int c = 0, a, temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = s.nextInt();
		temp = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}
		
		if (temp == c) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");

		}
	}
}
