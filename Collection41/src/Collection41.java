import java.util.*;

class Student {
	protected String name = "viji";

	protected void dept() {
		 System.out.println("\tinformation technology");
	}
}

public class Collection41 extends Student {
	public static void main(String arg[]) {
		Student s = new Student();
		System.out.println("\"Student information\"");
		System.out.println("\tStudent name:=" + s.name);
		System.out.println("\tdepartment name");
		s.dept();

	}
}