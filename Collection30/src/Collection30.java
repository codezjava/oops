import java.util.*;

public class Collection30 {
	public static void main(String arg[]) {
		Queue<String> l1 = new LinkedList<>();

		// using add method
		l1.add("yamuna");
		l1.add("kogi");

		// using offer method
		l1.offer("viji");
		l1.offer("nandhini");
		l1.offer("rani");
		l1.offer("rajee");
		l1.offer("ananthi");
		System.out.println("\"printing the queue element\"\n" + l1);

		String p1 = l1.peek();
		System.out.println("\n\"using peek method\"=" + p1);

		// using poll method
		String p2 = l1.poll();
		System.out.println("\n\"using poll method\"=" + p2);

		System.out.println("\n\"updated queue:\"\n" + l1);

		// using remove method
		String r1 = l1.remove();
		System.out.println("\n\"using remove method\"\n" + r1);

		System.out.println("\n\"updated queue:\"\n" + l1);

		// using element method
		String e1 = l1.element();
		System.out.println("\n\"using element method\"\n" + l1);

	}
}
