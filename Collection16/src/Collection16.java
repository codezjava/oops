import java.util.TreeSet;

public class Collection16 {
	public static void main(String arg[])
	{
		TreeSet<Integer> set=new TreeSet<>();
		set.add(11);
		set.add(5);
		set.add(3);
		set.add(8);
		set.add(9);
		System.out.println("\"printing the values of treeSet\"="+set);
		
		//using headSet() method
		System.out.println("\"using headSet() method\"= "+set.headSet(9));
		
		//using headSet() method and passed parameter
		System.out.println("\"using headSet() method and passed parameter\"= "+set.headSet(9,true));
		
		//using tailSet() method
		System.out.println("\"using tailSet() method\"="+set.tailSet(8));
		
		//using tailSet() method and passed parameter
		System.out.println("\"using tailSet() method and passed parameter\"="+set.tailSet(4,true));
		

		//using subSet() method and passed parameter
		System.out.println("\"using subSet() method and passed parameter\"="+set.subSet(4,true,8,true));
	}

}
