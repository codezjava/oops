package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex4 {
	public static void main(String arg[]) {
		String s = "//http:localhost";
		String i = "http";

		Pattern p = Pattern.compile(i);
		Matcher m = p.matcher(s);
		if (m.find()) {
			System.out.println("using start() & end() method");
			System.out.println("start: " + m.start() + "\nend: " + m.end());
		}
	}

}
