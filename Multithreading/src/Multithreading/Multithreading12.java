package Multithreading;

public class Multithreading12 {

	String str1="viji";
	String str2="rajee";
	
	Thread t1=new Thread("my thread 1")
	{
	public void run() {
		while(true) {
			synchronized(str1) {
				synchronized(str2) {
				System.out.println(str1+str2);
			}
		}
	}
	}
};
		
Thread t2=new Thread("my thread 2")
{		public void run() {
			while(true) {
				synchronized(str2) {
					synchronized(str1) {
					System.out.println(str1+str2);
					}
				}
			}
}
};
public static void main(String arg[]) {
	Multithreading12 m1=new Multithreading12 ();
	m1.t1.start();
	m1.t1.start();	
}
}