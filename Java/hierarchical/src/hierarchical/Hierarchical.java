package hierarchical;

class Collage { // parent class

	void collageDetails() {

		String name = "PKIET collage";
		System.out.println("collage name:\t" + name);
	}

}

class It extends Collage { // child class

	void itDetails() {

		String dept = "Information Technology";
		String name = "viji";
		System.out.println("\nDept Name:\t" + dept);
		System.out.println("Student name:\t" + name);

	}
}

class Ece extends Collage { // child class

	void eceDetails() {

		String dept = "Electronics and Communication Engineering";
		String name = "Keerthi";
		System.out.println("\nDept Name:\t" + dept);
		System.out.println("Student name:\t" + name);
	}
}

class Cse extends Collage { // child class

	void cscDetails() {

		String dept = "Computer Science Engineering";
		String name = "Priya";
		System.out.println("\nDept Name:\t" + dept);
		System.out.println("Student name:\t" + name);
	}
}

public class Hierarchical {

	public static void main(String arg[]) {

		Collage obj = new Collage(); // object creation
		obj.collageDetails();

		It i = new It(); // object creation
		i.itDetails();
		i.collageDetails();

		Ece e = new Ece(); // object creation
		e.eceDetails();
		e.collageDetails();

		Cse c = new Cse(); // object creation
		c.cscDetails();
		c.collageDetails();

	}

}
