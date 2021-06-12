package Multithreading;

class Firstthread extends Thread {
	public void run() {
		System.out.println("thread name: " + Thread.currentThread().getName());
		System.out.println("thread priority: " + Thread.currentThread().getPriority());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}
}

public class Multithreading4 {
	public static void main(String arg[]) {
		System.out.println("");
		Thread t1 = new Thread(new Firstthread(), "one");
		Thread t2 = new Thread(new Firstthread(), "two");
		Thread t3 = new Thread(new Firstthread(), "three");

		t1.start();
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		try {
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
