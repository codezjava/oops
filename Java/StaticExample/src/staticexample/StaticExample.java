package staticexample;

class Ex1 {

	// static varibles
	static String name;
	static int a;
	static int b = 10;

	// static block
	static {
		name = "viji";
		a = 10;
		a = a + 10;

	}

	static void staticMethod1()
	// static method
	{
		System.out.println("\narea calculation");
		System.out.println(a * a);
	}

	static void staticMethod2() {
		System.out.println(name);
		staticMethod1();// call the first static method "staticMethod1"

	}

	static class Ex2 {
		void add() {
			a = a + b;
			System.out.println("\nthe output is:\t" + a);
			staticMethod2();

		}

	}
}

public class StaticExample {
	public static void main(String args[]) {

		// static varibles
		System.out.println("the \"a\" value is:\t" + Ex1.a);
		System.out.println("the \"b\" value is:\t" + Ex1.b);
		System.out.println("\nneme:" + Ex1.name);
		Ex1.a = 5;
		System.out.println(Ex1.a);

		// static method
		Ex1.staticMethod1();
		Ex1.staticMethod2();

		// static class
		Ex1.Ex2 obj = new Ex1.Ex2();
		obj.add();
	}
}
