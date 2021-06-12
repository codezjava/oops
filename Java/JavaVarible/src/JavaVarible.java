class Cirule {
	int valueR = 5;
	static double PI = 3.14;
	int valueR1 = 20;

	void locVarible() {
		int valueR1 = 15;
		System.out.println(valueR1);
	}

	void instanceVarible() {
		System.out.println(this.valueR);
		System.out.println(valueR);
	}

	void staticVaraible() {
		System.out.println(Cirule.PI);
		System.out.println(PI);

	}

}

class JavaVarible {

	public static void main(String arg[]) {
		Cirule c1 = new Cirule();
		System.out.println(c1.valueR);
		System.out.println(c1.PI);
		Cirule.PI = 2.04;
		System.out.println(Cirule.PI);
		System.out.println(c1.valueR1);
		double area;
		area = 2 * c1.PI * c1.valueR * c1.valueR;
		System.out.println(area);
		area = 2 * c1.PI * c1.valueR1 * c1.valueR1;
		System.out.println(area);

	}

}
