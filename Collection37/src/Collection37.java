import java.util.Arrays;
import java.util.List;

public class Collection37 {
	public static void main(String arg[]) {
		Integer[] i1 = { 2, 4, 5, 6, 7, 8, 9 };
		String[] s1 = { "pink", "yellow", "green", "blue", "block" };

		// using asList method
		List<Integer> l1 = Arrays.asList(i1);
		System.out.println("\"using asList method for Integer\"\n" + l1);
		List<String> l2 = Arrays.asList(s1);
		System.out.println("\n\"using asList method for String\"\n" + l2);

		// using binarySearch
		System.out.println("\n---\"using binaraySearch method\"---");
		Integer[] i2 = { 1, 7, 8, 5, 9, 3, 8 };
		Integer search = Arrays.binarySearch(i2, 3);
		if (search <= 0) {
			System.out.println("\"Element is found in the array\"");
		} else {
			System.out.println("\"Element not found in the array\"");

		}

		// using ArraysEqual method
		System.out.println("\n---\"using ArraysEqual method\"---");
		Integer[] a = { 1, 3, 4, 5 };
		Integer[] b = { 1, 3, 4, 5 };
		boolean same = Arrays.equals(a, b);
		if (same) {
			System.out.println("\"Arrays a and b are equals\"="+same);
		} else {
			System.out.println("\"Arrays a and b are not equals\"="+same);
		}
		
		//using sort method
		
		System.out.println("\n---\"using sort method\"---");
		char[] c= {'R','T','Y','U','S','G'};
		Arrays.sort(c);
		System.out.println("sort Array is");
		for(char d:c)
		{
			System.out.print(d+", ");
		}

	}

}
