import java.util.Scanner;

public class Exampls1 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
        System.out.printf("fibonacci series upto %s numbers=  ",n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fib(i));
		}

	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int f1=1,f2=1,fibonacci=f1+f2;
		for(int i=3;i<=n;i++)
		{
			f1=f2;
		    f2=fibonacci;
			fibonacci=f1+f2;
			
			
		}
		return fibonacci;
	}
}
