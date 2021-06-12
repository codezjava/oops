import java.util.ArrayList;

public class Collection3 {
	public static void main(String arg[]) {
		// create an integer array
		int[] num1 = { 11, 22, 33, 44, 55, 66 };
		System.out.println("array value");

		for (Integer num2 : num1) {
			System.out.print(num2);
			System.out.println(" ");
		}

		// array to array list
		System.out.println("array to array list");
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		for (Integer num4 : num1) {
			num3.add(num4);
			System.out.println(num4);
        }

		// array list to array
		System.out.println("array list to array");
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        
        Object[] array=a1.toArray();
        for (Object arr:array)
        {
        	System.out.println(arr+" ");
        }
        
	}

}
