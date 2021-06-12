package Abstactclass3;

abstract class Figure {
	abstract void area(int a, int b);
}

class Rectangle extends Figure {

	public void area(int a, int b) {
		int a1;
		a1 = a * b;
		System.out.println("the Rectangle area is:");
		System.out.println(a1);

	}
}

class Triangle extends Figure {
	void area(int a, int b) {
		int a2;
		a2 = (a * b) / 2;
		System.out.println("The Triangle area is:");
		System.out.println(a2);
	}
}

public class Abstractclass3 {
	public static void main(String arg[]) {
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		System.out.println("Area calculation\n");
		r1.area(2, 3);
		t1.area(7, 3);

	}

}
