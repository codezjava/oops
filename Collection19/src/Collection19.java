import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Collection19 {
	public static void main(String arg[]) {
		HashMap<Integer, String> h1 = new HashMap<>();

		// using put method
		h1.put(1, "viji");
		h1.put(2, "nandhini");
		h1.put(3, "ananthi");

		// using get method
		System.out.println("using get method");
		System.out.println("printing the hashmap values " + h1.get(1));

		// using size() method
		System.out.println("using size() method");
		System.out.println("\nsize of the hashmap " + h1.size());

		Set s1 = h1.entrySet();
		System.out.println("using entrySet() method");
		for (Object s2 : s1) {
			Map.Entry e = (Map.Entry) s2;
			System.out.println(e.getKey() + ":" + e.getValue() + ",");
		}
		System.out.println("\nusing Iterator() method");
		Iterator i = h1.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry e = (Map.Entry) i.next();
			System.out.println(e.getKey() + ":" + e.getValue() + ",");
		}

	}

}
