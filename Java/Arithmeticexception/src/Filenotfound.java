import java.io.*;

public class Filenotfound {
	public static void main(String[] arg) {
		try
			(BufferedReader br = new BufferedReader(new FileReader("D:/viji.txt")))
			{
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);

			}
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
