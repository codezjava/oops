import java.util.HashSet;
public class Collection13 {
	public static void main(String arg[]) {
		HashSet hash=new HashSet();
		hash.add("viji");
		hash.add("rani");
		hash.add("nandhini");
		
		HashSet hash1=new HashSet();
		hash1.add("viji");
		
		boolean output=hash.containsAll(hash1);
		System.out.println("\"using containAll() method\"="+ output);
		
	  if(hash.isEmpty())
	  {
		  System.out.println("\n\"hash set is empty\"");
	  }
	  else
	  {
		  System.out.println("\n\"hash set is not empty\"");
	  }
	  
	  hash1.clear();
	  System.out.println("\n\"hash set\"="+hash1);
		
	  //using size() method
	  int s=hash.size();
	  System.out.println("\"hashset size is\"="+s);
	}

}
