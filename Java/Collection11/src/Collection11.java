import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collection11 {
	public static void main(String arg[]) {
		Vector<String> v1=new Vector<>();
		
		v1.add("viji");
		v1.add("rajee");
		v1.add("rani");
		v1.add("ananthi");
		
		//using set size method
		v1.setSize(10);
		System.out.println("\"Vector size\""+v1.size());
		System.out.println("\n\"Vector elements= \"");
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
		//convert vector to array list
		ArrayList<String> arrList=new ArrayList<>(v1);
		System.out.println("\n\"convert vector to array list\"");
		System.out.println(arrList);
		
		//convert array list to vector
		ArrayList<String> a1=new ArrayList<>();
		a1.add("pink");
		a1.add("yellow");
		a1.add("blue");
		
		Vector<String> v2=new Vector<>(a1);
		System.out.println("\n\"convert array list to vector\"");
		System.out.println(v2);
		
		//convert LinkedList to arryaList
		LinkedList<String> l1=new LinkedList<>();
		l1.add("cat");
		l1.add("dog");
		l1.add("pig");
		
		ArrayList<String> a2=new ArrayList<>(l1);
		System.out.println("\n\"convert LinkedList to arryaList\"");
		System.out.println(a2);
		
	}

}
