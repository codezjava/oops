package fib;

public class fib {
	public static void main(String arg[]) {
		int n = 10;
		int f1, f2 = 0, f3 = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(f3 + "");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}

}
