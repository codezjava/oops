package Generics;

public class Generics1<viji> {
	private viji v;

	public void set(viji v) {
		this.v = v;
	}

	public viji get() {
		return v;
	}

	public static void main(String arg[]) {
		Generics1<Integer> i = new Generics1<Integer>();
		i.set(34);
		System.out.println("Integer value is= " + i.get());

		Generics1<String> s = new Generics1<String>();
		s.set("viji");
		System.out.println("String value is= " + s.get());

	}

}
