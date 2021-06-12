package arrayreverse;

public class ArrayReverse {
	public static void main(String arg[])
	{
		int arr[]=new int[]{1,2,3,4,5};
		System.out.println("original array");
		for(int ar:arr)
			System.out.println("\t"+ar);
		System.out.println("\n"+"reverse of an array");
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.println("\t"+arr[i]+ " ");
		}
		
	}

}
