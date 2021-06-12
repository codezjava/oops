import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {
	public static void main(String arg[]) {
		ArrayList<String> dept = new ArrayList<>();
		dept.add("it");
		dept.add("csc");
		dept.add("ece");
		dept.add("eee");
		System.out.println("ArrayList: " + dept);

		// using for each loop
		System.out.println("using for each loop");
		for (String pkiet : dept) {
			System.out.println(pkiet);
		}
		System.out.println("size:\t" + dept.size());

		// sort the array list
		Collections.sort(dept);
		System.out.println("sort the array list:" + dept);

	}
}
