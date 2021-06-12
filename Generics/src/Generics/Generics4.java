package Generics;

import java.util.*;

public class Generics4 {
	public static void display(Collection<? extends Double> d) {
		Iterator it = d.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(" ");
	}

	public static void main(String arg[]) {
		ArrayList<Double> a1 = new ArrayList<Double>();
		System.out.println("the elements are");
		a1.add(22.3);
		a1.add(33.4);
		a1.add(44.4);
		a1.add(11.2);
		a1.add(66.6);
		display(a1);

	}

}
