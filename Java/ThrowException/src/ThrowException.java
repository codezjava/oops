
public class ThrowException {
	static void age(int a) {
		try {
			if (a >= 18) {
				throw new ArithmeticException("registration over");
			}
		} catch (ArithmeticException e) {
			System.out.println("registration only above 18..");
			throw e;

		}
	}

	public static void main(String arg[]) {
		try {
			age(44);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
