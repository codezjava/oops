package arrayodev;

public class Arrayodev {
	public static void main(String[] arg) {
		int ar[] = new int[] { 2, 3, 4, 5 };
		int i = 0;
		while (i < ar.length) {
		    
			if (ar[i] % 2 == 0) {
				System.out.println("even number are\t\t"+ ar[i] + " ");
				i++;
			} 
			else if(ar[i]%2!=0){
				System.out.println("odd number are\t\t"+ ar[i] + " ");
				
				i++;

			}

		}
	}
}
