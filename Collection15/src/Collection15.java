import java.util.TreeSet;
import java.util.Iterator;

public class Collection15 {
	public static void main(String arg[]) {
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("pink");
		t1.add("yellow");
		t1.add("green");
		t1.add("blue");
		t1.add("block");
		System.out.println("\"print the hashset values\n\"=\n" + t1);

		TreeSet<String> t2 = new TreeSet<String>();
		t2.add("viji");
		t2.add("nanadhini");

		// using addAll() method
		t1.addAll(t2);
		System.out.println("\n\"using addAll() method\"=" + t1);

		// using Iterator() method
		Iterator it = t1.iterator();
		System.out.println("\n\"using Iterator() method\"");
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		// using first() method
		System.out.println("\n\"using first() method\"=" + t1.first());

		// using last() method
		System.out.println("\n\"using last() method\"=" + t1.last());
		System.out.println("\n\"the treeSet elements are\"=" + t1);

		// using pollFirst() method
		System.out.println("\n\"using pollfirst() method\"=" + t1.pollFirst());

		// using pollLast() method
		System.out.println("\n\"using polllast() method\"=" + t1.pollLast());

		// using higher() method
		System.out.println("\n\"using higher() method\"=" + t1.higher("blue"));

		// using lower() method
		System.out.println("\n\"using lower() method\"=" + t1.lower("viji"));

		// using ceiling() method
		System.out.println("\n\"using celling() method\"=" + t1.ceiling("nandhini"));

		// using floor() method
		System.out.println("\n\"using floor() method\"=" + t1.floor("yellow"));
		
		//using remove() method
		boolean remove=t1.remove("viji");
		System.out.println("\n\"using remove() method\"=" +t1);

	}
}
