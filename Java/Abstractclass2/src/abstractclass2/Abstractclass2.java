package abstractclass2;
abstract class Collage
{
	abstract void mark(int a,int b,int c,int d);
}
class It extends Collage
{
	void mark(int a,int b,int c,int d)
	{
		int total=a+b+c+d;
		System.out.println("\t1.total mark:"+total);
	}
}
class  Csc extends Collage
{
	void mark(int a,int b,int c,int d)
	{
		int total=a+b+c+d;
		System.out.println("\t2.total mark:"+total);
	}
}

public class Abstractclass2 extends Collage {
	void mark(int a,int b,int c,int d)
	{
		int total=a+b+c+d;
		System.out.println("\t3.total mark:"+total);
	}

	public static void main(String arg[])
	{
		It i=new It();
		Csc c=new Csc();
		Abstractclass2 a=new Abstractclass2();
		System.out.println("Pkit marks:-");
		i.mark(70, 80, 60, 90);
		c.mark(89, 77, 69, 97);
		a.mark(77, 97, 79, 60);
	}
}
