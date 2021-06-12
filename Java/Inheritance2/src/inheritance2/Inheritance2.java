package inheritance2;
class Student
{
	Student()
	{
		System.out.println("Student mark details");
	}
	
}
public class Inheritance2  extends Student{
	Inheritance2(int num)
	{
		if(num>=35)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}
	Inheritance2()
	{
		System.out.println("Enter the mark");
	}
	public static void main(String arg[])
	{
		Inheritance2 i1=new Inheritance2(80);
		Inheritance2 i2=new Inheritance2();
	}
	

}
