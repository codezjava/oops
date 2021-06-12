import java.util.Scanner;

public class Examples4 {
	public static void main(String arg[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int number = s.nextInt();
		if (ispalindrome(number)) {
			System.out.println("number:"+number+" is a palindrome");

		} else {
			System.out.printf("number:"+number+" is not a palindrome");
		}
	}

	public static boolean ispalindrome(int number1) {
		int number = number1;
		int rev = 0;
		while (number1 != 0) {
			int remainder = number % 10;
			rev = (rev * 10) + remainder;
			number1 = number1 / 10;
		}
		if (number == rev) {
			return true;
		}
		return false;
	}

}
