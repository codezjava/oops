package interfaceclass;

interface Employee {
	public int totalStudent=100;
	public void name();

	public void roll();
}

interface Csc extends Employee {
	public void studentTotal();
}

class It implements Employee {
	public void details()
	{
		System.out.println("-------It details-------");
	}
	public void name() {
		System.out.println("name:viji");
	}

	public void roll() {
		System.out.println("roll:12");
	}
	public void total()
	{
		System.out.println(Employee.totalStudent);
	}

}

class Ece implements Csc {
	public void details()
	{
		System.out.println("\n-----Ece details------");
	}
	public void name() {
		System.out.println("name:nandhini");
	}

	public void roll() {
		System.out.println("roll:4");
	}

	public void studentTotal() {
		System.out.println("Student total:40");
	}
}

public class Interfaceclass {
	public static void main(String arg[]) {
		It i = new It();
		i.details();
		i.name();
		i.roll();
		Ece e = new Ece();
		e.details();
		e.name();
		e.roll();
		e.studentTotal();
		Csc c = new Ece();
		System.out.println("\n");
		c.name();
		c.roll();
		c.studentTotal();
		
		
	}

}
