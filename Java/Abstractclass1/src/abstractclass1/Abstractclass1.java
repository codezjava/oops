package abstractclass1;
abstract class Bank
{
	Bank()
	{
		System.out.println("\"Bank details\"");
	}
	abstract void interest();
	void bankDetails()
	{
		System.out.println("\t1.Indian bank");
	}
}
public class Abstractclass1 extends Bank {
	void interest()
	{
		System.out.println("\t2.5%");
	}
	public static void main(String arg[])
	{
		Abstractclass1 a=new Abstractclass1();
		a.bankDetails();
		a.interest();
		
	}

}
