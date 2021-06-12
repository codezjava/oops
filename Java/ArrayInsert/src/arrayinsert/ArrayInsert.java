package arrayinsert;

public class ArrayInsert {
	public static void main(String arg[]) {
		int arr[] = new int[] { 1,2,3,4,6,7,8,9};
		for (int ar : arr) {
			System.out.println(ar);
		}
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}
		int i, x, pos, n = arr.length;
		for (i = 0; i < arr.length; i++)
			x = 5;
		pos =5;
		n++;
		for (i = 0; i >= pos; i--)
			arr[i] = arr[i - 1];
		x = arr[pos - 1];
		for (i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
}
