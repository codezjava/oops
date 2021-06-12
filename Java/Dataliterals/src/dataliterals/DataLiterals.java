package dataliterals;

class literals {
	void bool() {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1\t" + b1);
		System.out.println("b2\t" + b2);
	}

	void integer() {
		int i1 = 1;
		int i2 = -2;
		int i3 = 01222;
		int i4 = 0b101;
		int i5 = 0xA;
		System.out.println("i1\t" + i1);
		System.out.println("i2\t" + i2);
		System.out.println("i3\t" + i3);
		System.out.println("i4\t" + i4);
		System.out.println("i5\t" + i5);

	}

	void floatLiterals() {
		float f1 = 7.123f;
		float f2 = -0.7f;
		float f3 = 0xB;
		float f4 = 0.00f;
		System.out.println("f1\t" + f1);
		System.out.println("f2\t" + f2);
		System.out.println("f3\t" + f3);
		System.out.println("f4\t" + f4);
	}

	void doubleLiterals() {
		double d1 = 2.34455756d;
		double d2 = 2.1d;
		double d3 = 0xA;
		double d4 = 0123;
		System.out.println("d1\t" + d1);
		System.out.println("d2\t" + d2);
		System.out.println("d3\t" + d3);
		System.out.println("d4\t" + d4);
	}

	void character() {
		char c1 = 'c';
		char c2 = '$';
		char c3 = '@';
		char c4 = '7';
		char c5 = '&';
		System.out.println("c1\t" + c1);
		System.out.println("c2\t" + c2);
		System.out.println("c3\t" + c3);
		System.out.println("c4\t" + c4);
		System.out.println("c5\t" + c5);
	}

	void StringLiterals() {
		String a = "a";
		String b = "vijaya";
		String c = "rani";

		System.out.println(a + b + c);

		System.out.println("viji\tarun");
		System.out.println("viji\tarun");
		System.out.println("viji\r arun");
		System.out.println("viji\\arun");
		System.out.println("viji\"arun");
		System.out.println("name\'s");

	}
}

public class DataLiterals {
	public static void main(String arg[]) {
		literals l1 = new literals();
		l1.bool();
		l1.integer();
		l1.floatLiterals();
		l1.doubleLiterals();
		l1.character();
		l1.StringLiterals();

	}
}
