import java.util.LinkedHashSet;

public class Collection18 {
	public static void main(String arg[]) {
		LinkedHashSet<String> h1 = new LinkedHashSet<>();
		h1.add("pink");
		h1.add("yellow");
		h1.add("blue");
		h1.add("block");
		h1.add("white");
		System.out.println("print the 1st linked hash set values" + h1);

		// using contains() method
		boolean b1 = h1.contains("pink");
		System.out.println("is the element \"pink\" present :" + b1);

		// using size() method
		System.out.println("\"size of LinkedHashSet\"=" + h1.size());

		// creating the array and using toArray()
		String[] arr = new String[5];
		arr = h1.toArray(arr);

		// displaying array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		LinkedHashSet<String> h2 = new LinkedHashSet<>();
		h2.add("pink");
		h2.add("yellow");
		h2.add("blue");
		h2.add("block");
		h2.add("white");
		System.out.println("print the 2nd linked hash set values" + h2);

		// using equal() method
		boolean b2 = h1.equals(h2);
		System.out.println("\n\"are both set equals\"=" + b2);

		// using retainAll()method
		System.out.println("\n\"using retainAll method\"=" + h1.retainAll(h2));

		// using remove() method
		System.out.println("\n\"using remove method\"=" + h1.remove("pink"));
		System.out.println("\n\"after remove the element\"=" + h1);

		// using removeAll() method
		System.out.println("\n\"using removeAll method\"=" + h1.removeAll(h2));

		// using clear() method
		h2.clear();
		System.out.println("\n\"using clear() method\"=" + h2);

	}

}
