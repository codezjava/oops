package interfaceclass1;

interface shaps {
	public void area();
}

class Box implements shaps {
	public int a = 2;

	public void area() {

		a = a * a;
		System.out.println(a);
	}

}

class Rectangle implements shaps {
	shaps s;

	Rectangle(shaps s) {
		System.out.println("cacluating the area of the box and rectangle");
		System.out.println("the area of the Box is");
		s.area();
		System.out.println("the area of the Rectangle is");
		this.area();
	
	}

	public int b = 2, h = 4, c;

	public void area() {
		c = b * h;
		System.out.println(c);
	}

}

public class Interfaceclass1 {
	public static void main(String arg[]) {
		Box b = new Box();
		Rectangle r = new Rectangle(b);
	}

}
