import java.util.Vector;
import java.util.Iterator;

public class Collection9 {
	public static void main(String arg[]) {
		Vector<String> v1 = new Vector<>();

		// add element using add() method
		v1.add("pink");
		v1.add("yellow");

		// adding element using addElement() method
		v1.addElement("green");
		v1.addElement("block");

		System.out.println("\"Vector element is:\"" + v1);

		Vector<String> v2 = new Vector<>();
		v2.add("blue");

		// using addAll() method
		v2.addAll(v1);
		System.out.println("\n\"print the vector element:\"" + v1);

		// using contains() method
		if (v1.contains("pink")) {
			System.out.println("\n\"pink is present at the vector list\"");
		} else {
			System.out.println("\n\"pink is not present in the list\"");
		}

		// get the first element
		System.out.println("\n\"the first element of the vector is:\"" + v1.firstElement());

		// get the last element
		System.out.println("\n\"the last element of the vector is:\"" + v1.lastElement());

		// using get() method
		String str = v1.get(1);
		System.out.println("\n\"Element  at index 1:\"" + str);

		// Using iterator()
		Iterator<String> i1 = v1.iterator();
		System.out.print("\n\"Vector: \"");
		while (i1.hasNext()) {
			System.out.print(i1.next());
			System.out.print(", ");
		}

		// using set() method
		v1.set(1, "blue");
		v1.set(3, "white");

		System.out.println("\n\"Vector elements after replacement\"");

		// using for loop
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		
		//using remove() method
		String str1=v1.remove(2);
		System.out.println("\n\"removed Element\"="+str1);
		System.out.println("\n\"removed element\"="+v1);
		
		//using clear() method
		v1.clear();
		System.out.println("\n\"using clear() method\"="+v1);

	}
}
