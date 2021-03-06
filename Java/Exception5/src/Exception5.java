import java.io.*;

public class Exception5 {
	public static FileInputStream f1(String fileName) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println("f1:oops,FileNotFoundException caught");
			throw new Error("f1:file not found");
		}
		System.out.println("f1:File input stream created");
		return fis;
	}

	public static FileInputStream f2(String fileName)
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(fileName);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("f2:oops FileNotFoundException caught");
			return fis;
		}
		finally
		{
			System.out.println("f2:finally block");
			return fis;
		}
	}

	public static void main(String args[]) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		String fileName = "viji";

		System.out.println("main:Starting" + Exception5.class.getName() + "with file name=" + fileName);
		try {
			fis1 = f1(fileName);
		} catch (Exception ex) {
			System.out.println("main:oops,general exception caught");
		} catch (Throwable th) {
			System.out.println("main:oops,throwable object caught");
		}
		fis2 = f2(fileName);
		System.out.println("main:" + Exception5.class.getName() + "ended");
	}
}
