class Student {
	String studentName;
	int studentAge;
	String studentAddress;

	static String studentDepartment;

}

class Instance {

	public static void main(String[] args) {
		Student.studentDepartment = "IT";

		Student copy1 = new Student();
		copy1.studentName = "viji";
		copy1.studentAge = 20;
		copy1.studentAddress = "Karaikal";

		System.out.println(copy1.studentName);
		System.out.println(copy1.studentAge);
		System.out.println(copy1.studentAddress);

		Student copy2 = new Student();
		copy2.studentName = "Prisi";
		copy2.studentAge = 19;
		copy2.studentAddress = "Karaikal";

		System.out.println(copy2.studentName);
		System.out.println(copy2.studentAge);
		System.out.println(copy2.studentAddress);

		Student copy3 = new Student();
		copy3.studentName = "Sound";
		copy3.studentAge = 18;
		copy3.studentAddress = "Karaikal";

		System.out.println(copy3.studentName);
		System.out.println(copy3.studentAge);
		System.out.println(copy3.studentAddress);

		System.out.println(Student.studentDepartment);

	}
}
