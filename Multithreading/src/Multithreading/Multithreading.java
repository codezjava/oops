package Multithreading;

class First extends Thread {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 100; j++) {

			}
		}
		System.out.println("first task");
	}
}

class Second extends Thread {
	public void run() {

		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println(i);

		}
		System.out.println("Second task completed");
	}
}

public class Multithreading {
	public static void main(String arg[]) {
		First m = new First();
		m.start();

		Second s = new Second();
		s.start();
	}

}
