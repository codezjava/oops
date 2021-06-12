import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class Collection36 {
	public static void main(String arg[]) {
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<>();

		// using add method
		lbq.add(3);
		lbq.add(4);
		lbq.add(5);

		// using offer method
		lbq.offer(2);
		lbq.offer(6);
		lbq.offer(8);

		// using size method
		Integer a1 = lbq.size();
		System.out.println("\n\"using size method\"" + a1);

		// using peek method
		System.out.println("\n\"using peek method\"" + lbq.peek());

		// using poll method
		System.out.println("\n\"using poll method\"" + lbq.poll());

		// using contains method
		boolean a2 = lbq.contains(2);
		System.out.println("\n\"2\" is contains in linkedBlockingQueue=" + a2);

		System.out.println("\n\"using Iterator method\"");
		Iterator<Integer> i = lbq.iterator();
		while (i.hasNext()) {
			System.out.println(i.next() + ",");
		}
		System.out.println("\n\"travsing the  Linkedblockingqueue element by using advanced for loop\"");
		for (Integer str : lbq) {
			System.out.println(str);

		}
		try {
			lbq.put(6);
			lbq.put(9);
			System.out.println("\n\"linkedblockingqueue\"=" + lbq);

			Integer in = lbq.take();
			System.out.print("\n\"using tack method\"=" + in);
			System.out.println("\n\"updated linkledblockingqueue\"=" + lbq);

		} catch (Exception e) {
			System.out.println(e);
		}

		Integer a3 = lbq.remove();
		System.out.println("\n\"using remove() method\"=" + a3);

		lbq.clear();
		System.out.println("\n\"using clear() method\"=" + lbq);

	}
}
