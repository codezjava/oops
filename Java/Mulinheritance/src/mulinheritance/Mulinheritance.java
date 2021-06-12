package mulinheritance;
class ClassA
{

	void empRollDetails()
	{
		int roll[]=new int[] {100};
		for(int ro:roll)
		System.out.println("\t1.rollno:"+ro);
	}
}
class ClassB extends ClassA
{
	void empNameDetails()
	{
		String name[]=new String[] {"viji"};
		for(String na:name)
		System.out.println("\t2.name:"+na);
	}
}
class Classc extends ClassB
{
	void empSalaryDetails()
	{
		int salary[]=new int[]{50000};
		for(int sa:salary)
		System.out.println("\t3.salary:"+sa);
		
	}
}

public class Mulinheritance {
	public static void main(String arg[])
	{
		System.out.println("\"Employee Details\"");
		Classc c=new Classc();
		c.empRollDetails();
		c.empNameDetails();
		c.empSalaryDetails();
	}

}
