package population2;

class India {
	String state;
	String country;
	double confirmed;
	double recovered;
	double deaths;

	public void details(String s, String c) {   //METHOD OVERLOADING
		this.state = s;
		this.country = c;
		System.out.println("COUNTRY:" + c);
		System.out.println("STATE :" + s);

	}

	public void details(double de) {            //METHOD OVERLOADING
		this.deaths = de;
		double pop = 72147030;
		System.out.println("Old population :" + pop);
		pop = pop - de;
		System.out.println("current population :" + pop);

	}
}

public class Population2 {
	public static void main(String arg[]) {
		India i = new India();
		i.details("tamilnadu", "India");
		i.details(65);
	}

}
