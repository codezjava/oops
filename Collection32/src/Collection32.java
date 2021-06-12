import java.util.*;
class Arrange implements Comparator<String>{
	String str1;
	String str2;
	public int compare(String s1,String s2) {
		this.str1=s1;
		this.str2=s2;
		return  s2.compareTo(s1);
	}
}

public class Collection32 {
	public static void main(String arg[]) {
		PriorityQueue<String> p1 = new PriorityQueue<>();

		// using add() method
		p1.add("viji");
		p1.add("rani");
		p1.add("rajee");
		p1.add("kogi");
		p1.add("ananthi");
		System.out.println("\"priting the priority queue elements\"\n" + p1);
	}

}
