import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class Collection20 {
	public static void main(String arg[]) {
		LinkedHashMap<String, String> l1 = new LinkedHashMap<>();
		l1.put("name", "rajee");
		l1.put("dept", "it");
		l1.put("college", "pkiet");
		System.out.println("printing the LinkedHashMap element\n" + l1);

		// using entrySet() method
		System.out.println("\nusing entrySet() method");
		Set s1 = l1.entrySet();
		for (Object s2 : s1) {
			Map.Entry e = (Map.Entry) s2;
			System.out.println(e.getKey() + ":" + e.getValue() + ",");
		}

		// using Iterator() method
		System.out.println("\nusing Iterator() method");
		Iterator i = l1.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry e = (Map.Entry) i.next();
			System.out.println(e.getKey() + ":" + e.getValue() + ",");
		}

	}

}
