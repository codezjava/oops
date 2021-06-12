import  java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection6 {
	public static void main(String arg[])
	{
		LinkedList<String> l1=new LinkedList<>();
		l1.add("java");
		l1.add("c");
		l1.add("php");
		l1.add("c#");
		l1.add("c");
		System.out.println("\"print the linked list values:\"\t"+l1);
		
		//using Iterator method
		System.out.println("\n\"print the values by using the iterator method\"");
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next());
			System.out.print(",");
		}
		
		//create the Array list
		 ArrayList<String> a1=new ArrayList<>();
		 a1.add("whats app");
		 a1.add("face book");
		 a1.add("instagram");
		 a1.add("telegram");
		 a1.add("messenger");
		 a1.add("whats app");
		 System.out.println("\n\n\"print the array list values:\"\t\n"+a1);
		
		 //add the element in the Array list by using ListIterator 
		ListIterator<String> list=a1.listIterator();
		list.add("hike");
		System.out.println("\n\"add the element using listIterator\"\n"+a1);
		
		//remove the element from the list
		list.next();
		list.remove();
		System.out.println("\n\"the new list is:\"\t\n"+a1);
		
		//change the element using set method
		list.next();
		list.set("gmail");
		System.out.println("\n\"the updated list is:\"\n"+a1);
		
		//access the element using list iterator
		System.out.println("\n\"access the element using hasnext() method\"");
		while(list.hasNext())
		{
			System.out.print(list.next());
			System.out.print(", ");
		}
		
		
		System.out.println("\n\n\"access the element using hasprevious() method\"");
		while(list.hasPrevious())
		{
			System.out.print(list.previous());
			System.out.print(", ");
		}
		
		
	}

}
