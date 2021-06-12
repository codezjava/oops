class Dept {
	String sub1;
	String sub2;
	String sub3;

	public Dept(String sub1, String sub2, String sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;

	}
}

class Student implements Cloneable {
	int id;
	String name;
	Dept dept;

	public Student(int id, String name, Dept dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Examples11 {
	public static void main(String arg[]) {
		Dept d = new Dept("it", "ece", "csc");
		Student s1 = new Student(22, "viji", d);

		Student s2 = null;

		System.out.println("Student course details");
		System.out.println("Student id: " + s1.id);
		System.out.println("Student name:" + s1.name);

		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(s1.dept.sub3);

		s2.dept.sub3 = "mech";

		System.out.println(s1.dept.sub3);

	}

}
