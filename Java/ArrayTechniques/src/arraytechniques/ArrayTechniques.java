package arraytechniques;

import java.util.Arrays;

class ArrayTech {

	static int intCount(int[] array) { // find array count
		System.out.println("\"the array count value is\"");
		int arrayCount = 0;

		for (int c : array) {
			arrayCount = +arrayCount;
			arrayCount++;
		}

		return arrayCount;
	}

	static int arraySum(int[] array) { // find array sum
		System.out.println("\"the array sum value is\"");
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum;
	}

	static int maximumNumber(int[] array) { // find array maximum value
		System.out.println("\"the array maximum value is\"");
		int maxValue = array[0];
		for (int i = 0; i < array.length; i++)
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		return maxValue;
	}

	static int minimumNumber(int[] array) { // find array minimum value
		System.out.println("\"the array minimum value is\"");
		int minValue = array[0];
		for (int i = 0; i > array.length; i++)
			if (array[i] < minValue) {
				minValue = array[i];
			}
		return minValue;
	}

	static int[] ascendingNumber(int[] array) { // sort the array in ascending order
		System.out.println("\"the array ascending value is\"");
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i]);
		}
		System.out.println(array[array.length - 1]);

		return array;
	}

	static int[] descendingNumber(int[] array) { // sort the array in descending order
		int temp = 0;
		System.out.println("\"the array descending value is\"");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i]);
		}
		System.out.println(array[array.length - 1]);

		return array;
	}

	static int[] similarNumber(int[] array) { // find similar number in an array
		System.out.println("\"the similar array values\"");
		int i, j;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.println(array[i]);
			}
		}
		return array;
	}

	static int[] greaterThan(int[] array, int value) { // find greater value in an array
		System.out.println("\"the greater value is\"");
		for (int i = 0; i < array.length; i++)
			if (value <= array[i])
				System.out.println(array[i]);
		return array;
	}

	static int[] lesserThan(int[] array, int value) { // find lesser value i an array
		System.out.println("\"the lesser value is\"");
		for (int i = 0; i < array.length; i++)
			if (value > array[i])
				System.out.println(array[i]);
		return array;
	}

	static int[] duplicateNumber(int[] array) { // find duplicate value in an array
		System.out.println("the duplicate value of an array");
		int value = 1;
		for (int i = 0; i < array.length; i++)
			if (array[i] == value) {
				System.out.println(array[i]);
			}

		return array;
	}

	static String stringSearch(String[] array) { // find the string in an array
		System.out.println("search the string to an array");
		String str = "viji";
		for (int i = 0; i < array.length; i++)
			if (array[i] == str) {
				System.out.println(array[i]);
			}
		return "found";
	}

	static int numberSearch(int[] array) { // find the number in an array
		System.out.println("serch the number to an array");
		int a = 1;
		for (int i = 0; i < array.length; i++)
			if (array[i] == a) {
				System.out.println(array[i]);
			}
		return 0;
	}

	static boolean stringSearch(String[] array, String str) {
		System.out.println("search the string form the array");

		for (int i = 0; i < array.length; i++) {
			if (array[i] == str) {
				return true;
			}
		}

		return false;
	}

	static boolean numberSearch(int[] array, int a) {
		System.out.println("serch the number from the array");

		for (int i = 0; i < array.length; i++) {
			if (array[i] == a) {
				return true;
			}
		}

		return false;
	}
}

class ArrayTechniques {
	public static void main(String[] args) {
		int a1[] = { 2, 4, 6, 3, 8, 5, 2, 1, 1, 5, 7 };
		String str[] = { "viji", "rani", "nandhini", "ananthi" };
		int a2[] = { 4, 5, 6, 7, 8 };
		int a3[] = { 2, 4, 5, 6, 8 };

		System.out.println(ArrayTech.intCount(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.arraySum(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.maximumNumber(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.minimumNumber(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.ascendingNumber(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.descendingNumber(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.similarNumber(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.greaterThan(a1, 3));
		System.out.println("\n");
		System.out.println(ArrayTech.lesserThan(a1, 8));
		System.out.println("\n");
		System.out.println(ArrayTech.duplicateNumber(a1));
		System.out.println("\n");
		System.out.println(ArrayTech.stringSearch(str));
		System.out.println("\n");
		System.out.println(ArrayTech.numberSearch(a1));
		System.out.println(ArrayTech.stringSearch(str, "viji") == true ? "Found" : "Not Found");
		System.out.println("\n");
		System.out.println(ArrayTech.numberSearch(a1, 7) == true ? "Found" : "Not Found");
		System.out.println("\n");

		System.out.println("Equal :" + Arrays.equals(a2, a3)); /** using the util.Arrays */
		System.out.println("Mismatch : " + Arrays.mismatch(a2, a3));
		System.out.println("compare :" + Arrays.compare(a2, a3));

	}
}
