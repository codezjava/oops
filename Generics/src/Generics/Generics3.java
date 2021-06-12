package Generics;

import java.util.ArrayList;
import java.util.Collection;

public class Generics3 {

	public static void print(Collection<?> v1) {
		for (Object v2 : v1) {
			System.out.println(v2 + " ");
		}
	}

	public static void main(String arg[]) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(43);
		a1.add(33);
		a1.add(44);
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("viji");
		a2.add("rajee");
		a2.add("ananthi");
		System.out.println("integer arraylist");
		print(a1);
		System.out.println("String arraylist");
		print(a2);
	}
}
