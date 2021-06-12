package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your email address");
		String email = sc.next();
		String r = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(r);
		Matcher m = p.matcher(email);
		if (m.matches()) {
			System.out.println("given email address is valid");
		} else {
			System.out.println("given email address is not valid");
		}
		sc.close();
	}
}
