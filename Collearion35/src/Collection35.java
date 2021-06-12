import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;

public class Collection35 {
	public static void main(String arg[]) {
		ArrayBlockingQueue<String> abd = new ArrayBlockingQueue<>(10);

		// using add method
		abd.add("pink");
		abd.add("yellow");
		abd.add("blue");

		// using offer method
		abd.offer("green");
		abd.offer("block");
		abd.offer("white");
		
		//using size method
		System.out.println("\"using size method\"="+abd.size());
		
		//using contains method
		boolean s=abd.contains("block");
		System.out.println("\"using contains method\""+s);

		// using Iterator method
		System.out.println("\n\"using Iterator method\"");
		Iterator<String> i = abd.iterator();
		while (i.hasNext()) {
			System.out.println(i.next() + ",");
		}
		System.out.println("\n\"travsing the arrayblockingqueue element by using advanced for loop\"");
		for (String str : abd) {
			System.out.println(str);

		}

		// using peek method
		System.out.println("\n\"using peek method\"=" + abd.peek());

		// using poll method
		System.out.println("\n\"using poll method\"=" + abd.poll());

		// using remove method
		boolean str = abd.remove("blue");
		System.out.println("\n\"blue\" element is removeing from the arrayblockingqueue=" + str);

		// using clear method
		abd.clear();
		System.out.println("\n\"using clear method\"=" + abd);

	}
}
