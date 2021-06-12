package student;

public class Student {
	int valueA=90;
	int valueB=67;
	int valueC=69;
	int valueD=89;
	int valueE=98;
	int valueF=56;

	Student()// default Constructor
	{
		System.out.println("\"PKIT COLLAGE\"");
	}

	Student(int a)// parameterized Constructor
	{
		int rollno = a;
		System.out.println("\nrollno" + rollno);
		System.out.println("name :viji");
		System.out.println("dept:it");
		System.out.println("year:2nd year");
		System.out.println("address:32,rr nagar." + "karaikal");

	}

	Student(String str)// parameterized constructor
	{
		String name = str;
		System.out.println("\nrollno:2");
		System.out.println("name:" + name);
		System.out.println("dept: ece");
		System.out.println("year:2nd year");
		System.out.println("address: 1,akkarai kulathu street." + "keezha oduthurai");
	}

	Student(int a, int b)// parameterized constructor
	{
		int rollno = a;
		int percentage = b;
		System.out.println("\nrollno:" + rollno);
		System.out.println("name :nandhini");
		System.out.println("dept:csc");
		System.out.println("year:3rd year");
		System.out.println("address:34,rk nagar." + "karaikal");
		System.out.println("percentage" + percentage);
	}

	Student(int a,int b,int c,int d,int e,int f)
 
 {   
	 this.valueA=a;
	 this.valueB=b;
	 this.valueC=c;
	 this.valueD=d;
	 this.valueE=e;
	 this.valueF=f;
 }
	 
 void total()
 {
	 int tol;
	 tol=valueA+valueB+valueC+valueD+valueE+valueF;
	System.out.println("\ntotal:"+tol);
	System.out.println("\n" +tol/6);
 
 }

}

class Cons {
	public static void main(String[] arg) {
		Student s1 = new Student();//object creation
		new Student(1);
		new Student("rani");
		new Student(2, 90);
        new Student(89, 65, 97, 76, 89, 54);
        s1.total();//method calling
		
	}
}
