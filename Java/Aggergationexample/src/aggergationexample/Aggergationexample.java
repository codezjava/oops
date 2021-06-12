package aggergationexample;

class Student {

	int roll;
	String dept;
	String name;
	int bkcode;

	Student(int roll, String dept, String name, int bkcode)// student details
	{

		this.roll = roll;
		this.dept = dept;
		this.name = name;
		this.bkcode = bkcode;

	}

	void studentDetails() {
		System.out.println("-------------Student Details-------------");

		System.out.println("\tStudentrollno :\t" + roll);
		System.out.println("\tStudentdept :\t" + dept);
		System.out.println("\tStudentname:\t" + name);
		System.out.println("\tbookcode:\t" + bkcode);

	}
}

class Library {
	int bkcode;
	String name;
	int roll;
	String dept;
	Student st;

	Library(int bkcode, String name, int roll, String dept, Student st) {
		this.bkcode = bkcode;
		this.name = name;
		this.roll = roll;
		this.dept = dept;
	}

	void libDetails() {
		System.out.println("\n---------book details-----------");
		switch (bkcode) {
		case 1:
			System.out.println("\tbook name:\tJAVA");
			break;
		case 2:
			System.out.println("\tbook name:\tDAA");
			break;
		case 3:
			System.out.println("\tbook name:\tMP");
			break;
		case 4:
			System.out.println("\tbook name:\tSS");
			break;
		case 5:
			System.out.println("\tbook name:\tCE1");
			break;
		case 6:
			System.out.println("\tbook name:\tM4");
			break;

		default:
			System.out.println("please enter your book code");
		}
	}
}

public class Aggergationexample {
	public static void main(String arg[]) {
		Student st = new Student(1, "it", "viji", 2);
		st.studentDetails();
		Library li = new Library(1, "viji", 10, "it", st);
		li.libDetails();

	}

}
