package converting;

class Type {
	static int integer;
	static float floatVal;
	static double doubleVal;
	static char character;
	static String str;
	static boolean bool;
	static long longVal;
	void con() {
		int a = Integer.parseInt("123");
		System.out.println(a);
		String b = Integer.toString(123);
		System.out.println(b);
		float c = Float.parseFloat("456.32");
		System.out.println(c);

	}
}

public class Converting {
	
	public static void main(String[] arg) {
		Type t1 = new Type();
		t1.con();
		System.out.println(Type.integer);
		System.out.println(Type.floatVal);
		System.out.println(Type.doubleVal);
		System.out.println(Type.character);
		System.out.println(Type.str);
		System.out.println(Type.bool);
		System.out.println(Type.longVal);
		System.out.println(null == null);
		System.out.println(null != null);

	}
}
