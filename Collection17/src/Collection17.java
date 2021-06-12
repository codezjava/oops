import java.util.TreeSet;
import java.util.Iterator;

public class Collection17 {
	public static void main(String arg[]) {
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("pink");
		t1.add("yellow");
		t1.add("blue");
		t1.add("green");
		t1.add("block");
		System.out.println("\"print the treeset1 element\"= " + t1);
		TreeSet<String> t2 = new TreeSet<>();
		t2.add("viji");
		t2.add("rani");
		t2.add("rajee");
		t2.add("nandhini");
		t2.add("kogi");
		System.out.println("\"print the treeset2 element\"= " + t2);
		t2.addAll(t1);

		// using iterator() method
		Iterator itr = t1.iterator();
		System.out.println("using iterator() method");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// using descendingSet
		System.out.println("\n\"using descending Set\"\n" + t2.descendingSet());

	}

}
