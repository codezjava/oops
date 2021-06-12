package bubblesort;

import java.util.Scanner;

public class bubblesort {
	public static void main(String args[])
	{
	int c, d, n, swap;
	Scanner in=new Scanner(System.in);
	System.out.println("input number of integer to sort");
	n=in.nextInt();
    int array[]=new int[n];
    System.out.println("Enter" +n+ "interger");
for(c=0;c<n;c++)
	array[c]=in.nextInt();
for(c=0;c<(n-1);c++)
	{
		for (d = 0; d < (n - c - 1); d++) 
		{
			if (array[d] > array[d + 1])
			{
				swap = array[d];
				array[d] = array[d + 1];
				array[d + 1] = swap;

			}
		}
	}
System.out.print("sort listnof no");
for(c=0;c<n;c++)
	System.out.println(+array[c]);
}}
