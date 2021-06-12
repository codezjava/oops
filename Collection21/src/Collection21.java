import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Collection21 {
	public static void main(String arg[]) {
		Map m = new TreeMap();
		m.put("name", "viji");
		m.put("dept", "it");
		m.put("college", "pkiet");
		System.out.println("printing the TreeMap values\n" + m);

		// using Iterator() method
		System.out.println("\nusing Iterator() method");
		Set s = m.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry e = (Map.Entry) i.next();
			System.out.println(e.getKey() + ":" + e.getValue() + ",");
		}
	}

}
