package arraysort;

public class Arraysort {
	public static void main(String arg[])
	{
		int temp;
		int arr[]= {6,7,3,9,10,3,4,2,1};
		for(int ar:arr)
			System.out.println(ar);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		
		}
		
		System.out.println("ascendig order:");
		for(int i=0;i<arr.length-1;i++) {
		System.out.println(arr[i]);
		}	System.out.println(arr[arr.length-1]);
		
		
	}

}
