package employee;

public class Employee {
	int regno;
	int salary;
	Employee()
	{
		System.out.println("Employee details");
	}
	Employee(int a)
	{
		System.out.println("\nregno"+a);
		System.out.println("name:"+"viji");
		System.out.println("salary:"+"50000");
		System.out.println("__________________");
		
	}
	Employee(String a)
	{
		System.out.println("\nrego"+"2");
		System.out.println("name"+a);
		System.out.println("salary:"+"30000");
		System.out.println("___________________");
		
	}
	Employee(int a,String b)
	{
		System.out.println("\nregno:"+a);
		System.out.println("name:"+b);
		System.out.println("salary:"+"30000");
		System.out.println("____________________");
	}

}
class Emp
{
	public static void main(String[] arg)
	{
		new Employee();
		new Employee(1);
		new Employee("rani");
		new Employee(3,"nandhini");
	}
}
