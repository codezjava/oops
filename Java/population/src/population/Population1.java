package population;

class Tamilnadu {
	double confirmed;
	double recovered;
	double deaths;

	Tamilnadu(double c, double r, double d) {
		this.confirmed = c;
		this.recovered = r;
		this.deaths = d;

	}
}

public class Population1 {
	String state;
	String country;
	Tamilnadu details;

	Population1(String s, String co, Tamilnadu t1) {
		this.state = s;
		this.country = co;
		this.details = t1;

	}

	public static void main(String arg[]) {
		Tamilnadu t1 = new Tamilnadu(1103, 29, 53);
		Population1 p = new Population1("Tamilnadu", "India", t1);
		System.out.println("corona virus details");
		System.out.println("\tcountry:"+ p.country);
		System.out.println("\tstate :"+p.state);
		System.out.println("\tconfirmed:"+p.details.confirmed);
		System.out.println("\trecovered:"+p.details.recovered);
		System.out.println("\tdeaths:"+p.details.deaths);

	}

}
