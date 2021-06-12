package Regex;

import java.util.regex.Pattern;

public class Regex3 {
	public static void main(String arg[]) {
		String str1 = "123-345-566";
		String str2 = "-";
		Pattern p = Pattern.compile(str2, Pattern.CASE_INSENSITIVE);
		String[] s = p.split(str1);
		for (String s1 : s) {
			System.out.println(s1);
		}
		System.out.println("Splited String:" + s.length);
	}
}
