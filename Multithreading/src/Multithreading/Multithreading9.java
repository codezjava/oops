package Multithreading;

class Interthread extends Thread {
	int tbalance = 0;

	public void run() {
		synchronized (this) {
			System.out.println("calculation for total balance");
			for (int i = 0; i <= 30; i++) {
				tbalance = tbalance + i;
			}
			System.out.println("notification call");
			this.notify();
		}
	}
}

public class Multithreading9 {
	public static void main(String arg[]) throws InterruptedException {
		Interthread in = new Interthread();
		in.start();
		synchronized (in) {
			System.out.println("calling wait() method");
			in.wait();
			System.out.println("total balance: " + in.tbalance);
		}
	}
}
