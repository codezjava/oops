package Generics;
public class Generics2 {
	public <viji> void print(viji[] v1) {
		for (viji v2 : v1) {
			System.out.println(v2 + " ");
		}
	}

	public static void main(String arg[]) {
		Generics2 g1 = new Generics2();
		Integer[] a1 = { 2, 5, 6, 7, 8 };
		String[] s1 = { "viji", "rajee", "kogi" };
		System.out.println("the integer array is");
		g1.print(a1);
		System.out.println("the String array is");
		g1.print(s1);
	}
}
