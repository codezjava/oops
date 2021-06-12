package operatores;

public class Operatores {
	public static void main(String[] arg) {
		String str1 = "arun";
		String str2 = "viji";
		System.out.println(str1 + str2);
		int a = 45;
		int b = 720;
		System.out.println("add\t" + (a + b));//arithmetic operator
		System.out.println("sub\t" + (a - b));
		System.out.println("mul\t" + (a * b));
		System.out.println("div\t" + (a / b));
		System.out.println("mod\t" + (a % b));

		
		a=b;
		System.out.println("the result is\t"+a);//
		a+=b;
		System.out.println("the result is\t"+a);
		a-=b;
		System.out.println("the result is\t"+a);
		a*=b;
		System.out.println("the result is\t"+a);
		a/=b;
		System.out.println("the result is\t"+a);
		a%=b;
		System.out.println("the result is\t"+a);
		 
		
		
		int a1=30;
		int b1=40;
		
		int c=(a1<b1)?a1:b1;//ternary operator
		System.out.println(c);
		
		int c1=(a1>b1)?a1:b1;
		System.out.println(c1);
		
		System.out.println(++a1);//unary operator
		System.out.println(--a1);
		System.out.println(a1++);
		System.out.println(a1--);
	}
}
