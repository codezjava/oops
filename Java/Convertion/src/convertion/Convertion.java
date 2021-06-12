package convertion;

public class Convertion {
	public static void main(String[] arg) {
		int i = 257;
		System.out.println(i);
		byte b = 45;
		System.out.println(b);
		double d = 323.143;
		System.out.println(d);

		// byte to integer
		i = (int) b;
		System.out.println(i);

		// integer to double
		d = (double) i;
		System.out.println(d);

		// byte to double
		d = (double) b;
		System.out.println(d);

		// integer to byte
		b = (byte) i;
		System.out.println("int to byte convertion value is\t\t" + b);

		// double to integer
		i = (int) d;
		System.out.println("double to int converted value is\t" + i);

		// double to byte
		b = (byte) 323.143;
		System.out.println("doublr to byte converted value is\t" + b);

	}
}
