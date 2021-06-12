package Enum;

import java.util.Scanner;

public class Enum2 {

	enum colour {
		BLUE, PINK, BLOCK, YELLOW, GREEN
	}

	private int op;

	public void display(int op) {
		this.op = op;
		switch (op) {
		case 1:
			System.out.println("BLUE");
			break;
		case 2:
			System.out.println("PINK");
			break;
		case 3:
			System.out.println("BLOCK");
			break;
		case 4:
			System.out.println("YELLOW");
			break;
		case 5:
			System.out.println("GREEN");
			break;
		default: {
			System.out.println("Enter your correct option");
			break;
		}
		}

	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Enum2 e = new Enum2();
		System.out.println("Enter your option");
		int op = sc.nextInt();
		e.display(op);
		sc.close();
	}

}
