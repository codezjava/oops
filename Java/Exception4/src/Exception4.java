
import java.io.*;

class InputFile {
	private BufferedReader in;

	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader (fname));
		} catch (FileNotFoundException e) {
			System.err.println("could not open"  +fname);
			throw e;
		} catch (Exception e) {
			try {
				in.close();
			} catch (IOException e2) {
				System.err.println("in.close() unsuccessful");
			}
			throw e;
		} finally {

		}
	}

	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}

	
	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() successful");
		} catch (IOException e2) {
			throw new RuntimeException("in.close() failes");
		}
	}
}

public class Exception4 {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("Cleanup.java");
			String s;
			int i = 1;
			while ((s = in.getLine()) != null)
				;
			in.dispose();
		} catch (Exception e) {
			System.err.println("Caught Exception in main");
			e.printStackTrace();
		}

	}
}
