import java.util.Hashtable;
import java.util.Enumeration;

public class Collection22 {
	public static void main(String arg[]) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "viji");
		ht.put(2, "nandhini");
		ht.put(3, "rajee");
		ht.put(4, "ananthi");

		Enumeration em = ht.keys();
		while (em.hasMoreElements()) {
			Integer key = (Integer) em.nextElement();
			System.out.println("key=" + key + "; values =" + ht.get(key));
		}

	}

}
