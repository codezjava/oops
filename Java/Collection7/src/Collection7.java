import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Collection7 {
	public static void main(String[] arg) {

		ArrayList<String> a1 = new ArrayList<>();

		// using isEmpty() method
		System.out.println("\"Array list is empty\":" + a1.isEmpty());

		a1.add("viji");
		a1.add("nandhini");
		a1.add("rajee");
		System.out.println("\"Array list is empty\":" + a1.isEmpty());

		// sort the array list using sort() method
		Collections.sort(a1);
		System.out.println("\n\"sort the array list\"");
		for (String a2 : a1) {
			System.out.println(a2);

		}
		
		LinkedList<String> l1=new LinkedList<>();
		System.out.print("\"print the linked list values\"");
		l1.add("yamuna");
		l1.add("aishu");
		l1.add("anandhi");
		
		//using addFirst() method
		l1.addFirst("viji");
		System.out.println("\n\"using addFirst() method\"");
		System.out.println(l1);
		
		//using addLast() method
		l1.addLast("rajee");
		System.out.println("\n\"using addLast() method\"");
		System.out.println(l1);
		
		//using removeFirst() method
		l1.removeFirst();
		System.out.println("\n\"using removeFirst() method\"");
		System.out.println(l1);
		
		
		//using removeLast() method
		l1.removeLast();
		System.out.println("\n\"using removeLast() method\"");
		System.out.println(l1);
	}
}
