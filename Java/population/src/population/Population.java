package population;

import java.util.Scanner;

interface Virus {
	public void details();
}

class India implements Virus {
	public void details() {
		System.out.println(" virus affected people details in india");
		System.out.println("confirmed :1,024 ");
		System.out.println("recovered :85");
		System.out.println("Deaths    :24");
	}

}

class Italy implements Virus {
	public void details() {
		System.out.println("virus affected pepole details in italy");
		System.out.println("confirmed :92472");
		System.out.println("recovered :12,384");
		System.out.println("Deaths    :10,023");
	}
}

class China implements Virus {
	public void details() {
		System.out.println("virus affected people details in china ");
		System.out.println("confirmed :81,394");
		System.out.println("recovered :74,971");
		System.out.println("Deaths    :3,295");

	}

}

public class Population {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("corona virus details");
		System.out.println("Enter the option which country details you want");
		System.out.println("1.India");
		System.out.println("2.Italy");
		System.out.println("3.China");
		n = in.nextInt();
		switch (n) {
		case 1:
			India a1 = new India();
			a1.details();
			break;
		case 2:
			Italy a2 = new Italy();
			a2.details();
			break;
		case 3:
			China a3 = new China();
			a3.details();
			break;

		}

	}
}
