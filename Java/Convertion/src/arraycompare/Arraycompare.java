package arraycompare;

public class Arraycompare {
	public static void main(String arg[])
	{
		int array1[]= {1,4,5,7};
		int array2[]= {14,3,6,8};
		for(int ar1:array1)
			System.out.println(ar1+"\n");
		for(int ar2:array2)
			System.out.println("\n"+ar2);
		if(array1==array2)
		{
			System.out.println("the array was same");
		}
		else 
		{
			System.out.println("the array was not same");
		}
	}

}
