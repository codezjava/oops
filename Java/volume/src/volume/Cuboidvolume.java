package volume;

public class Cuboidvolume {
	public double h, b, l;

	public void Cuboidvolume(double h, double b, double l) {
		h = h;
		b = b;
		l = l;
	}

	public void calculation() {
		double c;
		c = l * h * b;
		System.out.println("the Triangle area is" + c);
	}

}
