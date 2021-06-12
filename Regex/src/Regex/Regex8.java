package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex8 {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your phone number");
		String phone = sc.next();
		String r = "\\d{10}";
		Pattern p = Pattern.compile(r);
		Matcher m = p.matcher(phone);
		if (m.matches()) {
			System.out.println("the phone number is valid");
		} else {
			System.out.println("the above phone number is not valid");
		}
		sc.close();
	}
}
