
class Type { 

	boolean a = true;
	int b = 20;
	float c = 50.09f;
	double d = 40.9876298d;
	char e = 'f';
	long f = 1234567891011121314l;
	byte g = 9;

	void converstion() { 
		char h = 'c';
		int i = h;
		long j = i;
		float k = j;
		double l = k;
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("the converted output is\t" + l);
	}
}

class DataType {
	public static void main(String arg[]) {
		Type t1 = new Type(); 
		System.out.println("boolean\t" + t1.a);
		System.out.println("integer\t" + t1.b);
		System.out.println("float\t" + t1.c);
		System.out.println("double\t" + t1.d);
		System.out.println("char\t" + t1.e);
		System.out.println("long\t" + t1.f);
		System.out.println("byte\t" + t1.g);
		t1.converstion(); 

	}

}
