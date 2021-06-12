package arrayoperation;

public class Arrayoperation {
	public static void main(String[] arg) {
		System.out.println("\"find the greater and smaller number from an array\"");
		int arr[] = new int[] { 12, 23, 4, 6, 39, 2 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(max);
		System.out.println(min);

	}

}
