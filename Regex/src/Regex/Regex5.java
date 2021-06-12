package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
	public static void main(String arg[]) {
		String s = "//http:localhost";
		String s1 = ".*//http.*";
		Pattern p = Pattern.compile(s1, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		System.out.println("LookingAt(): " + m.lookingAt());
		System.out.println("matches(): " + m.matches());

	}
}
