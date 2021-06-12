package Enum;

enum Mobile {
	WA {
		public String toString() {
			return ("Whatsapp");
		}
	},
	FB {
		public String toString() {
			return ("Facebook");
		}

	};
}

public class Enum4 {
	public static void main(String arg[]) {
		System.out.println(Mobile.FB.toString());
		System.out.println(Mobile.WA.toString());
	}
}