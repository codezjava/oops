package serialization1;

public class Program implements java.io.Serializable {
	public int acnum;
	public String name;
	public String bname;

	public void details() {
		System.out.println("back details" + acnum + " " + name + " " + bname);
	}

}
