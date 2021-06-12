import java.util.HashSet;

class Student {
	String name, dept;
	int id;

	public Student(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;

	}
}

public class Collection14 {
	public static void main(String arg[]) {
		HashSet<Student> hash = new HashSet<Student>();
		Student s1 = new Student(12, "viji", "it");
		hash.add(s1);
		Student s2 = new Student(13, "nandhini", "ece");
		hash.add(s2);
		Student s3 = new Student(14, "ananthi", "csc");
		hash.add(s3);

		System.out.println("\n\"printing the hashset element using foreachloop\n\"");
		for (Student h : hash) {
			System.out.println(h.id + ", " + h.name + ", " + h.dept);
		}

		// create hash set and add the element to the hashset
		HashSet<String> h1 = new HashSet();
		h1.add("viji");
		h1.add("rani");
		h1.add("kogi");
		h1.add("ananthi");
		h1.add("nandhini");
		System.out.println("\"print the hash set values\"=\n" + h1);

		// using removeIf() method
		h1.removeIf(h -> h == ("viji"));
		System.out.println("\n\"using remove if method\"=\n" + h1);

	}

}
