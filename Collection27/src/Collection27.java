import java.util.HashMap;
import java.util.Set;

public class Collection27 {
	public static void main(String arg[]) {
		HashMap<String, Double> veg = new HashMap<>();
		veg.put("tomatoes", 20.50);
		veg.put("onions", 5.50);
		veg.put("potatoes", 30.00);
		System.out.println("\"priting the hashmap elements\"\n" + veg);

		Set<String> value = veg.keySet();
		for (String val : value) {
			System.out.println(val);
		}

		// using containsKey method
		System.out.println("\n\"Searching vegtable list of items keys or names\n ");
		if (veg.containsKey("onions")) {
			System.out.println("\"the vegtable list contains key onions\"");
		} else {
			System.out.println("\n\"the vegatable list does not contains key onions\"");
		}

		if (veg.containsKey("apple")) {
			System.out.println("\n\"the vegtable list contains key apple\"");
		} else {
			System.out.println("\n\"the vegtable list does not contains key apple\"");
		}

		// using containsValue method
		if (veg.containsValue(30.00)) {
			System.out.println("\n\"the vegtable list contains Value of potatoes\"");
		} else {
			System.out.println("\n\"the vegtable list does not contains value of potatoes");
		}
	}
}
