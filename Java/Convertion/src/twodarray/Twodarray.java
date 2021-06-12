package twodarray;

public class Twodarray {
	public static void main(String[] arg) {
		int twoD[][] = { { 10, 100 }, { 100, 10 } };
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD.length; j++) {
				System.out.println(twoD[i][j] + " ");

			}
			System.out.println();
		}

	}

}
