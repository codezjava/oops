package Multithreading;

public class Multithreading11 {
public static void main(String arg[]) {

	final String str1="viji";
	final String str2="arun";
	Thread t1=new Thread() {
		public void run() {
			System.out.println("starting "+str1);
			synchronized(str1) {
			System.out.println("1st thread-locked 1st string");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			synchronized(str2) {
				System.out.println("1st thread-locked 2nd string");
			}
			}
			System.out.println("no deadlock");
			
		}
	};
	Thread t2=new Thread() {
		public void run() {
			System.out.println("starting "+str2);
			synchronized(str2) {
			System.out.println("2nd thread-locked 2nd string");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			synchronized(str1) {
				System.out.println("2nd thread-locked 1st string");
			}
			}
			System.out.println("no deadlock");
			
		}
	};
	t1.start();
	t2.start();
	
	
}
}
