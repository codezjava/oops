package inheritance1;
class Coffee
{
	String name="sunrise";
	void print()
	{
		System.out.println("brand name:\t"+name);
	}
	
}

public class Inheritance1 extends Coffee {
	String name="3 roses";
	void print()
	{
		System.out.println("brand name:\t"+name);
		super.print();
	}
	public static void main(String arg[])
	{
		Inheritance1 i=new Inheritance1();
		i.print();
		
	}

}
