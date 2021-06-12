import java.util.*;

public class Collection39 {
	public static void main(String arg[]) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(4);
		l1.add(5);
		l1.add(3);
		l1.add(9);
		l1.add(1);
		System.out.println("\"printing the list values\"=" + l1);

		// create a synchronizedCollection
		System.out.println("\n...\"using synchronizedCollection method\"...");
		Collection<Integer> c1 = Collections.synchronizedCollection(l1);
		System.out.println("\t\"Synchronized collection\"=" + c1);

		// create a synchronizedList
		System.out.println("\n...\"using synchronizedList method\"...");
		List<Integer> l2 = Collections.synchronizedList(l1);
		System.out.println("\t\"Synchronized list\"=" + l2);

		// create a synchronizedSet
		System.out.println("\n...\"using synchronizedSet method\"...");
		Set<String> s1 = new TreeSet<String>();
		s1.add("blue");
		s1.add("yellow");
		s1.add("green");
		s1.add("block");
		s1.add("pink");
		System.out.println("\t\"the set element are\"=" + s1);

		Set<String> s2 = Collections.synchronizedSet(s1);
		System.out.println("\t\"Synchronized Set\"=" + s2);

		// using synchronizedMap method
		System.out.println("\n...\"using synchronizedMap method\"...");

		Map<String, String> m1 = new HashMap<String, String>();

		m1.put("name", "viji");
		m1.put("collage", "pkiet");
		System.out.println("\"the map element are\"=" + m1);

		Map<String, String> m2 = Collections.synchronizedMap(m1);
		System.out.println("\t\"SynchronizedMap is\"=" + m2);

		// using synchronizedSortedSet method
		System.out.println("\n...\"using synchronized SortedSet method\"...");

		SortedSet<Integer> ss1 = new TreeSet<Integer>();
		ss1.add(4);
		ss1.add(1);
		ss1.add(5);
		ss1.add(2);
		System.out.println("\t\"SortedSet element are\"=" + ss1);

		SortedSet<Integer> ss2 = Collections.synchronizedSortedSet(ss1);
		System.out.println("\t\"SynchronizedSortedSet is\"=" + ss2);

		// using synchronizedSoredMap
		System.out.println("\n...\"using synchronized SortedMap method\"...");

		SortedMap<Integer, String> sm1 = new TreeMap<Integer, String>();
		sm1.put(4, "viji");
		sm1.put(1, "nandhini");
		sm1.put(5, "ananthi");
		sm1.put(2, "rajee");
		System.out.println("\t\"SortedSet element are\"=" + sm1);

		SortedMap sm2 = (SortedMap) Collections.synchronizedSortedMap(sm1);
		System.out.println("\t\"SynchronizedSortedMap is\"=" + sm2);

	}

}
