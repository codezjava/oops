package smallestnum;

public class SmallestNum {
	public static void main(String arg[])
	{
		int temp;
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println("the second smallest valuse is\t"+arr[1]);
	}
}

			
	


		
		
