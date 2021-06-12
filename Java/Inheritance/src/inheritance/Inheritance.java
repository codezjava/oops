package inheritance;

class Square {                                   //Parent class
	public void area1() {
		int x = 2, area;
		area = x * x;
		System.out.println("\"The Square area is:\"\t\t" +area);
	}

}

class Rectangle extends Square {                 //Child class
	public void area2() {
		int w = 2, h = 4, area;
		area = w * h;
		System.out.println("\"The Rectangle area is:\"\t" +area);

	}
}

class Parallelogram extends Rectangle {          //Child class
	public void area3() {
		int h = 5, b = 2, area;
		area = h * b;
		System.out.println("\"The Parallelogram area is:\"\t"+area);

	}
}

public class Inheritance {
	public static void main(String arg[]) {
		Square s = new Square();
		s.area1();
		System.out.println("\n");
		Rectangle r = new Rectangle();
		r.area1();
		r.area2();
		System.out.println("\n");
		Parallelogram p = new Parallelogram();
		p.area1();
		p.area2();
		p.area3();
	}

}
