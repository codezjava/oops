package typeofprint;

public class Typeofprint {
	void formate()
	{
		 String name1="viji";
		 String name2="arun";
		 System.out.println(name1+name2);
				 
		System.out.println("LOVE is not just about"
				+ "\nfinding the right"
				+ "\nperson, but creating"
				+ "\nthe right relationship."
				+ "\nIt's not abouthow"
				+ "\nmuch love you have in"
				+ "\nthe beginning, but"
				+ "\nhow much love yu"
				+ "\nbuilt till the end.");
		System.out.print("*arun");
		System.out.print("viji*");
	}
	public static void main(String[] arg)
	{
		Typeofprint ty=new Typeofprint();
		ty.formate();
	
	System.out.printf("%S%n", "\nviji");//string
	System.out.printf("%s%n", "viji");

	
	System.out.printf("%n%B","flase");//boolean
	System.out.printf("%n%b","flase");
	System.out.printf("%n%b","null");
	System.out.printf("%n%b","true");
	System.out.printf("%n%b","43");
	
	System.out.printf("%nage:%d%n",20);//integer
	
	System.out.printf("%n%.2f",24.895765);//float
	
	System.out.printf("%n%c", 'v');//char
	System.out.printf("%n%C",'a');
	
	
			}

}

