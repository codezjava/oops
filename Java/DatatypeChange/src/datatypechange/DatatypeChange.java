package datatypechange;
class Change
{
	void convert()
	{
		int a = Integer.parseInt("8675");
		String str = Integer.toString(4567);
		float fl = Float.parseFloat("76");
		Float val1 = Float.parseFloat("4362");
	      	    

		System.out.println(a);
		System.out.println(str);
		System.out.println(fl);
		System.out.println(val1);
		
	}
	
}

public class DatatypeChange {
	public static void main(String arg[]) {
		int i = 20;
		short s = (short) i;
		float f = (float) s;
		double d = (double) f;
		System.out.println(i);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
		char c2 = 'v';
		byte b = (byte) c2;
		int i2 = b;
		long l2 = i2;
		float f2 = l2;
		double d2 = f2;

		System.out.println(b);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		double d3 = 55.98547d;
		float f3 = (float) d3;
		long l3 = (long) f3;
		short s3 = (short) l3;
		int i3 = (int) s3;
		byte b3 = (byte) i3;
		char c3 = (char) b3;
		System.out.println(d3);
		System.out.println(f3);
		System.out.println(l3);
		System.out.println(s3);
		System.out.println(i3);
		System.out.println(b3);
		System.out.println(c3);
	    Change obj=new Change();
	    obj.convert();

		
	}

}
