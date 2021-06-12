package arrayrcombine;

public class ArrayCombine {
	public static void main(String[] arg) {
		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[] { 6, 7, 8, 9, 10 };
		int length = arr1.length + arr2.length;
		int[] result = new int[length];
		
		
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			result[arr1.length+j] = arr2[j];
			
		}
		for (int combine:result) {
			{
				System.out.println(combine);
			}
		}

	}

}
