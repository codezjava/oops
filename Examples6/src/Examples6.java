import java.util.Scanner;
public class Examples6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number  to find the square root");
		int sqrt=sc.nextInt();
		double num=sqrt*sqrt;
		System.out.printf("Square root of %s is %s",sqrt,num);
		
	}

}
