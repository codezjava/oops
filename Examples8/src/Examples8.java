import java.util.Scanner;
public class Examples8 {
	public static void main(String arg[])
	{
		System.out.println("Enter the string you want to revers");
		public String rev(String s)
		{
			char c[]=s.toCharArray();
			int i=0,j=c.length-1;
			while(i<j) {
				char temp=c[i];
				c[j]=c[i];
				c[j]=temp;
				i++;
				j--;
				
			}
			return String(c);
			
			
		}
	}
	
	}
		
		