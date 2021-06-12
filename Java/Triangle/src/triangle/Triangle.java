package triangle;

public class Triangle {
	public double d1, d2;

	public Triangle(double a, double b) {
		d1 = a;
		d2 = b;
	}

	public void area() {
		double r;
		r = (0.5) * d1 * d2;
		System.out.println("Triangle area is" + r);

	}

}
