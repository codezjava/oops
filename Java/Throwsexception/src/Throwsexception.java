import java.io.PrintWriter;
import java.io.*;

class Listofnumbers {
	int[] list = new int[10];

	public Listofnumbers() {
		for (int i = 0; i < 10; i++) {
			list[i] = i;
		}
	}

	void writeList() {
		PrintWriter out = null;
		try {
			System.out.println("Entering the statment");
			out = new PrintWriter(new FileWriter("viji.txt"));
			for (int i = 0; i < 10; i++) {
				System.out.println("Value at: " + i + " = " + list[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException" + e.getMessage());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("Closing Printwriter");
				out.close();
			} else {
				System.out.println("printwriter not open");
			}
		}
	}
}

public class Throwsexception {
	public static void main(String[] args)throws IndexOutOfBoundsException   {
		Listofnumbers l = new Listofnumbers();
		l.writeList();
	}

}
