package Arrayoddeven;

public class Arrayoddeven {
	public static void main(String[] arg) {

		int arr[] = new int[] { 2, 4, 5, 6, 8, 9 };

		System.out.println("\"odd numbers are\"");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(" "+arr[i] + " ");
			}
		}

		System.out.println("\"even number are\'");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(" "+arr[i] + " ");

			}
		}
	}

}
