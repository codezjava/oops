import java.util.*;

class sort implements Comparator<String> {
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);

	}
}

public class Collection31 {
	public static void main(String arg[]) {
		PriorityQueue<String> p1 = new PriorityQueue<>();

		// using add() method
		p1.add("viji");
		p1.add("rani");
		p1.add("rajee");
		p1.add("kogi");
		p1.add("ananthi");

		// using offer() method
		p1.offer("nandhini");
		System.out.println("\"printing the PriorityQueue element\"\n" + p1);

		// using peek() method
		String a1 = p1.peek();
		System.out.println("\n\"using peek() method\"\n" + a1);

		// using remove() method
		boolean a2 = p1.remove("kogi");
		System.out.println("\n\"the element \"kogi\" removed?" + a2);

		// using poll() method
		String a3 = p1.poll();
		System.out.println("\n\"removed element using poll(): " + a3);

		// using Iterator() method
		System.out.println("\n\"using Iterator() method\"");
		Iterator<String> i1 = p1.iterator();
		while (i1.hasNext()) {
			System.out.print(i1.next());
			System.out.print(", ");
		}

	}
}
