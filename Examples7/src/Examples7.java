import java.util.Scanner;

public class Examples7 {

	public static void main(String arg[]) {

		// create an array
		int arr[] = new int[5];

		System.out.println("Enter the elements to an array");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.printf("Duplicate numbers of an array is %s", arr[j]);
					break;
				}
			}

		}
	}

}
