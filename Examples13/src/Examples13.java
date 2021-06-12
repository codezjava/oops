import serialization.Student;
import java.io.*;

public class Examples13 {
	public static void main(String arg[]) {
		System.out.println("deserialization process....");
		Students s2 = null;
		try {
			FileInputStream fi = new FileInputStream("Stu.txt");
			ObjectInputStream ob = new ObjectInputStream(fi);
			s2 = (Students) ob.readObject();
			System.out.println("name" + s2.name);
			System.out.println("id" + s2.id);
			System.out.println("Dept" + s2.dept);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ce) {
			System.out.println("Student class isnot found");
			ce.printStackTrace();
		}
	}
}
