import java.util.*;

class Details<D> {
	private D d1;

	public void set(D d1) {
		this.d1 = d1;
	}

	public D get() {
		return d1;
	}

	public static <D> void printItem(D[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}

public class Collection8 {
	public static void main(String arg[]) {
		Details dd = new Details<>();
		dd.set("viji");
		dd.set(11);

		String[] arr1 = { "viji", "rani", "nandhini" };

		Details.printItem(arr1);
		System.out.println("\nStudent details");
		System.out.println("name:" + dd.get());
		System.out.println("roll no:" + dd.get());
	}

}
