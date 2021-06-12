import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection38 {
	public static void main(String arg[]) {

		// create arryaList
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(4);
		a1.add(6);
		a1.add(8);
		a1.add(7);

		a1.add(1);
		System.out.println("\"ArrayList element are\"=" + a1);

		// using reverse method
		System.out.println("\n---\"using reverse method\"---");
		Collections.reverse(a1);
		System.out.println("\"the reverse array List is \"=" + a1);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(55);
		a2.add(77);

		// using addAll method
		System.out.println("\n---\"using addAll method\"---");
		a2.addAll(a1);
		System.out.println("\"the new arraylist is\"" + a2);

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(45);
		a3.add(34);

		// using fill method
		System.out.println("\n---\"using fill method\"---");
		Collections.fill(a3, 11);
		System.out.println("\"updated arraylist is\"=" + a3);

		// using min method
		int m1 = Collections.min(a1);
		System.out.println("\n\"using min method\"=" + m1);

		// using max method
		int m2 = Collections.max(a1);
		System.out.println("\n\"using max method\"=" + m2);

		// using shuffle method
		System.out.println("\n---\"using shuffle method\"---");
		System.out.println("\"before shuffle the arraylist\"" + a1);
		Collections.shuffle(a1);
		System.out.println("\"after shuffle the arraylist\"" + a1);

		// using swap method
		System.out.println("\n---\"using swap method\"---");
		ArrayList<String> a4 = new ArrayList<String>(Arrays.asList("e", "r", "t", "v"));
		System.out.println("\"the arrayList elements are\"" + a4);
		Collections.swap(a4, 3, 1);
		System.out.println("\"the swapped arraylist is\"=" + a4);

	}

}
