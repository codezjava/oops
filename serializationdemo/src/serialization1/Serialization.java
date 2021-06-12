package serialization1;

import java.io.*;

public class Serialization {
	public static void main(String arg[]) {
		Program p = new Program();
		p.acnum = 234343;
		p.name = "viji";
		p.bname = "iob";

		try {
			FileOutputStream fl = new FileOutputStream("bank.ser");
			ObjectOutputStream ob = new ObjectOutputStream(fl);
			ob.writeObject(p);
			ob.close();
			fl.close();
			System.out.println("the byte code is generated");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
