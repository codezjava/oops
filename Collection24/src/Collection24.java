import java.util.LinkedHashMap;

public class Collection24 {
	public static void main(String arg[]) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("viji", 2);
		lhm.put("nandhini", 6);
		lhm.put("kogi", 3);
		System.out.println("\"printing the linkedhashmap values\"\n" + lhm);

		// using putIfAbsent()
		lhm.putIfAbsent("ananthi", 4);
		System.out.println("\n\"using putIfAbsent method\"\n" + lhm);

		LinkedHashMap<String, Integer> lhm1 = new LinkedHashMap<>();
		lhm1.put("rajee", 1);

		// using putAll method
		lhm1.putAll(lhm);
		System.out.println("\n\"new linked hash map\"\n" + lhm1);

		// using entrySet method
		System.out.println("\n\"using entrySet method\"\n" + lhm1);

		// using keySet method
		System.out.println("\n\"using keySet method\"\n" + lhm1);

		// using values method
		System.out.println("\n\"using values method\"\n" + lhm1);

		// using get method
		System.out.println("\n\"using get method\"\n" + lhm1.get("viji"));

		// using getOrDefault
		int value = lhm1.getOrDefault("kogi", 3);
		System.out.println("\n\"returned Number:\"" + value);

		// using remove method
		boolean value1 = lhm1.remove("viji", 2);
		System.out.println("\n\"is the entry two is removed?\"= " + value1);

	}

}
