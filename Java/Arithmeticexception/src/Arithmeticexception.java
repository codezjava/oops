
public class Arithmeticexception {

	public static void main(String arg[]) {
		try {
			int a[] = new int[5];
			a[7] = 3 / 1;
			System.out.println(a[7]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
		} catch (Exception e) {
			System.out.println("Some Exception");
		} finally {
			System.out.println("Final Block");
		}
	}
}
