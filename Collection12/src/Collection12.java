import java.util.Iterator;
import java.util.HashSet;

public class Collection12 {

	public static void main(String ar[]) {
		HashSet h1 = new HashSet();

		// using add() method
		h1.add("viji");
		h1.add(23);
		h1.add("nandhini");
		System.out.println("\"HashSet elements \"=" + h1);

		// using Iterator method
		Iterator i1 = h1.iterator();
		System.out.println("\n\"using Iterator method\"");
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		// create hashSet
		HashSet h2 = new HashSet();
		h2.add(3);
		h2.add(5);
		h2.add(2);
		System.out.println("\n\"printing hash set1 values\"=" + h2);

		HashSet h3 = new HashSet();
		h3.add(1);
		h3.add(3);
		h3.add(5);
		System.out.println("\n\"printing hash set2 values\"=" + h3);

		// using addAll() method
		h2.addAll(h3);
		System.out.println("\n\"using addAll() method\"=" + h2);

		// using retainAll() method
		h2.retainAll(h3);
		System.out.println("\n\"using retainAll() method\"=" + h2);

		// using removeAll() method
		HashSet h4 = new HashSet();
		h4.add(7);
		h4.add(9);
		h4.removeAll(h3);
		System.out.println("\n\"using removeAll() method\"=" + h4);

	}
}
