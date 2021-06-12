import java.util.Scanner;

public class Examples3 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		System.out.printf("Is %s a palinorome? :%s %n", str, ispalindrome(str));
		s.close();
	}

	public static boolean ispalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return true;
		}
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
			
}
