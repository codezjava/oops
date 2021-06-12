package Enum;

enum Phone {
	WA("whatsapp"), FB("facebook");

	private String p1;

	private Phone(String p1) {
		this.p1 = p1;
	}

	String showValue() {
		return p1;
	}

}

public class Enum5 {
	public static void main(String arg[]) {

		// using values() method
		System.out.println("Application and full forms\n");
		for (Phone pp : Phone.values()) {
			System.out.println(pp + " full form " + pp.showValue());
		}
		Phone ph;
		// using valueOf() method
		ph = Phone.valueOf("WA");
		System.out.println("\nusing valueOf() method =" + ph);
		ph = Phone.valueOf("FB");
		System.out.println("\nusing valueOf() method =" + ph);

	}
}
