package Multithreading;

public class Multithreading7 extends Thread {
	Multithreading7() {
		setDaemon(false);
	}

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread: " + getName());
		} else {
			System.out.println("user thread: " + getName());
		}
	}

	public static void main(String arg[]) {

		System.out.println("...\"using daemon thread method\"...");
		Multithreading7 mu1 = new Multithreading7();
		Multithreading7 mu2 = new Multithreading7();
		Multithreading7 mu3 = new Multithreading7();
		System.out.println("Current thread: " + Thread.currentThread());
		mu1.setDaemon(false);
		mu1.start();

		mu2.setDaemon(true);
		mu2.start();

		mu3.setDaemon(false);
		mu3.start();
	}

}
