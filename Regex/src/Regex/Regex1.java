package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String arg[]) {
		String str1 = "hai the is viji";
		String str2 = ".*viji.*";
		Pattern p = Pattern.compile(str2, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str1);
		boolean b = m.find();
		if (b) {
			System.out.println("match found");
		} else {
			System.out.println("match not found");
		}
	}

}
