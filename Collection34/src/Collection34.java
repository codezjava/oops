import java.util.*;

public class Collection34 {
	public static void main(String arg[]) {
		Deque<Integer> dq = new LinkedList<Integer>();

		// using add method
		dq.add(24);
		dq.add(32);
		dq.add(65);
		dq.add(45);
		dq.add(2);
		dq.add(3);
		dq.add(5);
		dq.add(8);

		// using addFirst method
		dq.addFirst(23);

		// using addLast method
		dq.addLast(27);

		// using offer method
		dq.offer(77);

		// using advanced for loop
		System.out.println("\"using advanced for loop\"");
		for (Integer in : dq) {
			System.out.println(in);
		}

		// using getFriest method
		System.out.println("\"using getFirst method\"=" + dq.getFirst());

		// using getLast method
		System.out.println("\"using getLast method \"=" + dq.getLast());

		// using peek method
		System.out.println("\"using peek method \"=" + dq.peek());

		// using poll method
		System.out.println("\"using poll method\"=" + dq.poll());

		System.out.println("\n\"before removeing the element\"");
		// using removeFirst method
		System.out.println("\n\"using removeFirst method\"=" + dq.removeFirst());
		System.out.println("\n\"after remove the element\"" + dq);

		// using removeLast method
		System.out.println("\n\"using removeLast method\"=" + dq.removeLast());
		System.out.println("\n\"after remove the element\"" + dq);

		// using Iterator method
		System.out.println("\n\"using Iterator method\"");
		Iterator<Integer> i1 = dq.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());

		}

	}

}
