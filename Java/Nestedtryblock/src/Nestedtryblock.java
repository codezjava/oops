
public class Nestedtryblock {
	public static void main(String arg) {
		try {
			int arr[] = { 1, 0, 5, 6 };
			try {
				int x = arr[3] / arr[1];
			} catch (ArithmeticException e) {
				System.out.println("divide by zero");
			}
			arr[4] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
	}
}