import java.util.*;

public class Collection33 {
	public static void main(String arg[]) {
		Deque<String> q1 = new ArrayDeque<String>();

		// using add method
		q1.add("viji");
		q1.add("anandhi");
		q1.add("vino");

		// using offer method
		q1.offer("kogi");
		q1.offer("rani");
		q1.offer("nandhini");
		
		//using offerFirst method
		q1.offerFirst("aishu");
		
		System.out.println("\"the arrayqueue element are\"" + q1);

		// using Iterator method
		System.out.println("\n\"using Iterator method\"");
		Iterator<String> i1 = q1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());

		}

		// using peekFirst method
		String str = q1.peekFirst();
		System.out.println("\n\"using peekfirst method\"=" + str);

		// using peekLast method
		System.out.println("\n\"using peeklast method\"=" + q1.peekLast());

		// using pollFirst method
		System.out.println("\n\"using pollfirst method\"=" + q1.pollFirst());

		// using pollLast method
		System.out.println("\n\"using polllast method\"=" + q1.pollLast());

		// using advanced for loop
		System.out.println("\n\"using advanced for loop\"");
		for (String s : q1) {
			System.out.println(s);
		}
	}

}
