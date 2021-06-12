import java.util.Scanner;

public class Examples9 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want to find factorial");
		int num=sc.nextInt();
		System.out.printf("%s is %s",num,factorial(num));
	}
		public static int factorial(int num) {
		if(num==0||num==1) {
		      return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
		
	}

}
