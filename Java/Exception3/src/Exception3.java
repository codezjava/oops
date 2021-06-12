import java.util.Scanner;


class digit_exception extends Exception {
	digit_exception() {
		super("bad key digits are not allowed");
	}
}

class alphabet_exception extends Exception {
	alphabet_exception(String s) {
		super(s);
	}
}

public class Exception3 {
	public static void main(String arg[])
	{
		int opt;
		System.out.println("\n CustomException");
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1.digitException "+ "\n2.alphabetException");
		System.out.println("\n Enter a option");
		try {
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				String str=sc.next();
				char ar1[]=str.toCharArray();
				for(char i:ar1) {
					if(Character.isDigit(i)) {
						continue;
					}
					else
					{
						throw new alphabet_exception("bad key alphabets are not allowed");
					}
				}
				break;
			case 2:
				String str1=sc.next();
				char ar2[]=str1.toCharArray();
				for(char i:ar2) {
					if(Character.isDigit(i)) {
						throw new digit_exception();
					}
				}
				break;
			}
		}
				catch(alphabet_exception e)
				{
					System.out.println(e);
				}
				catch(digit_exception e)
				
				{
					System.out.println(e);
				}
			}
}
