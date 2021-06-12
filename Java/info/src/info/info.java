package info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class stud {
	String sname, tname, des, deptt, depts;
	int d, m, y, yr;

	void student() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sname");
		sname = br.readLine();
		System.out.println("Enter the date");
		d = Integer.parseInt(br.readLine());
		System.out.println("Enter the month:");
		m = Integer.parseInt(br.readLine());
		System.out.println("Enter the dept:");
		depts = br.readLine();
	}

	void showstud() {
		System.out.println("Student name" + sname);
		System.out.println("Date of birth:" + d + "/" + m + "/" + y);
		System.out.println("Year" + yr);
		System.out.println("Department:" + depts);
	}

	void teacher() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the staff name");
		tname = br.readLine();
		System.out.println("Enter the destination");
		deptt = br.readLine();
	}

	void showteach() {
		System.out.println("Staff namwe" + tname);
		System.out.println("Destination:" + des);
		System.out.println("Department:" + deptt);
	}
}

class info {
	public static void main(String args[]) throws IOException {
		stud s = new stud();
		s.student();
		System.out.println("      ");
		s.showstud();
	}
}
