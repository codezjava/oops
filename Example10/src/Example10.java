class Students implements Cloneable {

	String name;
	int id;

	public Students(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Example10 {
	public static void main(String arg[]) throws CloneNotSupportedException {

		Students st = new Students("viji", 23);
		Students st1 = (Students) st.clone();

		System.out.println("Student details");
		System.out.println("name: " + st1.name);
		System.out.println("id: " + st1.id);
	}

}
