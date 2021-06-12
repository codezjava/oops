package arraysum;

public class Arraysum {
	public static void main(String  arg[]) {
		int sum=0,avr;
		int arr[]=new int[] {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avr=sum/5;
		System.out.println("the average\t" +avr);
		
	}
	

}
