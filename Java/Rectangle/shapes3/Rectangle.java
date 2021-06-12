package shapes3;

public class Rectangle {
	public double d1, d2;

	public Rectangle(double a, double b) {
		d1 = a;
		d2 = b;
	}

	public void area() {
		double r;
		r = d1*d2;
		System.out.println("Triangle area is" + r);

	}

}

