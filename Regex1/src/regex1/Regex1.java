package regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
	public static void mian(String arg[]) {
		String s = "//http:localhost";
		String s1 = "http";
		Pattern p = Pattern.compile(s1, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		System.out.println("LookingAt(): " + m.lookingAt());
	}
}
