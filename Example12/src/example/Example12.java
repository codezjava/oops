package example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable {
	String name;
	int id;
	String dept;

	Students(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

public class Example12 {
	public static void main(String arg[]) {
		try {
			Students s = new Students("viji", 12, "it");
			FileOutputStream f = new FileOutputStream("Students.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(s);
			o.close();
			f.close();
			System.out.println("the byte code is saved in \"stu.ser\"");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
