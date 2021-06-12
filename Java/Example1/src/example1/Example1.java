package example1;

class Student {
	int rollno;
	String name;

	Student(int r, String n) {
		this.rollno = r;
		this.name = n;

	}

	Student(int r) {
		this.rollno = r;
		name = "viji";
	}

	Student(Student k) {
		this.rollno = k.rollno;
		this.name = k.name;
	}

	void display() {
		System.out.println("Student details");
		System.out.println("Roll no is:" +rollno);
		System.out.println("Name is:" + name+"\n");
	}
}

public class Example1 {
	public static void main(String arg[])
	{
		Student s1=new Student(1,"nandhini");
		Student s2=new Student(2);
		Student s3=new Student(s2);
		s1.display();
		s2.display();
		s3.display();
	}

}
