package Multithreading;

 class Example extends Thread {
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Thread name: "+Thread.currentThread().getName());
		}
	}
 }
class  Multithreading6{
	public static void main(String arg[]) {
		Example ex= new Example ();
		ex.start();

		try {
			ex.interrupt();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}

