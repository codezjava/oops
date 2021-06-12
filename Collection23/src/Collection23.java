import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Iterator;

public class Collection23 {
	public static void main(String arg[]) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("name", "viji");
		ht.put("dept", "it");
		ht.put("collage", "pkiet");

		// using Enumeration method
		Enumeration em;
		String str;
		em = ht.keys();

		while (em.hasMoreElements()) {
			str = (String) em.nextElement();
			System.out.println(str + ": " + ht.get(str));
		}

		// using Iterator method
		Iterator<String> i = ht.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			String value = ht.get(key);
			System.out.println("key :" + key + ", value:" + value);
		}
	}

}
