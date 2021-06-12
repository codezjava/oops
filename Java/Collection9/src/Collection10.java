import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection10 {
	public static void main(String arg[]) {
		Stack<String> s1 = new Stack<>();

		// add Element to the stack
		s1.push("blue");
		s1.push("pink");
		s1.push("block");
		s1.push("red");
		s1.push("green");
		System.out.println("\"stack list is\"=" + s1);

		// using pop() method
		String str = s1.pop();
		System.out.println("\n\"the poped element is\"=" + str);

		// using peek() method
		String str1 = s1.peek();
		System.out.println("\n\"using peek() method\"=" + str1);

		// using search() method
		int str2 = s1.search("red");
		System.out.println("\n\"using search() method\"=" + str2);

		if (str2 != -1) {
			System.out.println("\nFound the element \"red\" at position:" + str2);
		} else {
			System.out.println("Element is not found");
		}

		// using Iterator() method

		System.out.println("\n\"using Iterator() method\"");
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String str3 = i1.next();
			System.out.println(str3);
		}

		// using size() method
		System.out.println("\n\"stack size is\":" + s1.size());

		// using empty() method()
		System.out.println("\n\"is empty\"=" + s1.empty());
	}
}
