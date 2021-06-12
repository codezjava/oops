import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mulitexception {
	public static void main(String arg[]) {
		try {
			int arr[] = new int[5];
			arr[6] = 5 / 0;
			System.out.println("Arithmetic exception ");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
         System.out.println("ArithmeticException or ArrayIndexOutOfBoundsException");
		}

		try (BufferedReader br = new BufferedReader(new FileReader("D:/viji.txt"))) {
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);

			}

		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
