package stringformate;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Strformating {

	void buff() throws IOException {
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter your full name ,address,phone no,city");
			
            String name = br.readLine();
            System.out.println("name:\t" + name);
            
			String addr = br.readLine();
			System.out.println("address:\t" + addr);
			
			String city = br.readLine();
			System.out.println("City:\t" + city);
			
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			
			int pho = Integer.parseInt(buff.readLine());
			System.out.println("phoneNo:\t" + pho);

		}

	}
}

public class StringFormate {

	public static void main(String[] arg)  throws IOException {

		
		Strformating str = new Strformating();
		str.buff();

	}

}

