
public class Nestedtry {
	public static void main(String[] arg) {
		String[] s = { "viji", "123", null, "rani" };
		for (int i = 0; i < s.length; i++) {
			try {
				int a = s[i].length();
				try {
					System.out.println(s[i+1]);
					try {
						a = Integer.parseInt(s[i]);
					} catch (NumberFormatException e) {
						System.out.println("NumberFormatException");
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException");
				}
			} catch (NullPointerException e) {
				System.out.println("NullPointerException");
			}
		}
	}
}
