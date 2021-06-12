package compostion;

class Coffee {

	String brand;
	int female;
	int male;
	int child;

	Coffee(String brand, int female, int male, int child) {
		this.brand = brand;
		this.female = female;
		this.male = male;
		this.child = child;
	}

}

class Tea {

	String brand;
	int female;
	int male;
	int child;

	Tea(String brand, int female, int male, int child) {
		this.brand = brand;
		this.female = female;
		this.male = male;
		this.child = child;
		Coffee c = new Coffee("sunrise", 10, 20, 4);

		System.out.println("------------Coffee lovers------------");
		System.out.println("Coffee brand\t" + c.brand);
		System.out.println("1.fermale\t" + c.female);
		System.out.println("2.male\t\t" + c.male);
		System.out.println("3.child\t\t" + c.child);

		System.out.println("------------Tea lovers------------");
		System.out.println("Tea brand\t" + this.brand);
		System.out.println("1.fermale\t" + this.female);
		System.out.println("2.male\t\t" + this.male);
		System.out.println("3.child\t\t" + this.child);

	}
}

public class Compostion {
	public static void main(String arg[]) {
		Tea t = new Tea("3 roses", 5, 4, 10);
	}

}
