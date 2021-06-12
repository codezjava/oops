package Multithreading;

public class Multithreading3 extends Thread {
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("current thread priority: " + Thread.currentThread().getPriority());

		System.out.println("current thread name: " + Thread.currentThread().getName());
	}

	public static void main(String arg[]) {
		Multithreading3 mu1 = new Multithreading3();
		Multithreading3 mu2 = new Multithreading3();
		Multithreading3 mu3 = new Multithreading3();
		
		mu1.setPriority(MAX_PRIORITY);
		mu2.setPriority(MIN_PRIORITY);
		mu3.setPriority(NORM_PRIORITY);
		
		mu1.setName("thread one");
		mu2.setName("thread two");
		mu3.setName("thread three");
		
		mu1.start();
		mu2.start();
		mu3.start();
	}
}