package Regex;

import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String arg[]) {
		String str1 = "viji";
		String str2 = "^viji$";
		boolean b = Pattern.matches(str2, str1);
		System.out.println("using matches() method= " + b);
	}
}
