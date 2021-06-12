package arraysearch;

public class Arraysearch {
	public static void main(String arg[]) {
		{
			int arr[] = new int[] { 2, 5, 6, 7, 3 };
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				if (arr[i] == arr.length) {
					System.out.println("the serach element is" +"\t"+ arr[i]);
					i++;

				}

			}
		}
	}
}
