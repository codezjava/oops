import java.util.LinkedList;

public class Collection4 {
public static void main(String arg[])
{
	LinkedList<String> list=new LinkedList<>();
	
	// add  elements to a linked list
	list.add("Apple");
	list.add("kiwi");
	list.add("grape");
	list.add("mango");
	list.add("banana");
	System.out.println("Linked list "+list);
	
	LinkedList<String> fruits=new LinkedList<>();
	fruits.add("papaya");
	
	// add all elements of list in fruits
	fruits.addAll(list);
	System.out.println("fruits name "+fruits);
	
	//get the element from the linked list
	String str=list.get(3);
	System.out.println("Element of index 3 is:" +str);
	
	//change the element using set method
	list.set(2, "watermelon");
	System.out.println("the updated list is "+list);
	
	//remove the element from the linked list
	String str1=list.remove(4);
	System.out.println("removed Element:"+str1);
	
	System.out.println("updated list is"+list);
	
	//clear the list
	list.clear();
	System.out.println("list"+list);
}
}
