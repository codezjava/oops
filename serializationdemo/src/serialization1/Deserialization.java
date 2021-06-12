package serialization1;

import java.io.*;

public class Deserialization {
	public static void main(String arg[]) {
		Program p = null;
		try {
			FileInputStream fl = new FileInputStream("bank.ser");
			ObjectInputStream ob = new ObjectInputStream(fl);
			p = (Program) ob.readObject();
			ob.close();
			fl.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			System.out.println("program class is not found");
			ex.printStackTrace();
		}

		System.out.println("bank details");
		System.out.println("account number: " + p.acnum);
		System.out.println("name: " + p.name);
		System.out.println("bank name: " + p.bname);
	}

}
