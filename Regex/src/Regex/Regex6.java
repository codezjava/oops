package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex6 {
	private static String s1 = "\\";
	private static String s2 = "http:localhost";
	private static String s3 = "mycomputer";

	public static void main(String arg[]) {
		try {
			Pattern p = Pattern.compile(s1);

			Matcher m = p.matcher(s2);
			s2 = m.replaceAll(s3);
			
		} catch (PatternSyntaxException e) {
			System.out.println("the PatternSyntaxException are");
			System.out.println(e.getDescription());
			System.out.println(e.getIndex());
			System.out.println(e.getPattern());
			System.out.println(e.getMessage());

		}

	}

}
