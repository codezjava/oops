package Multithreading;

public class Multithreading5 implements Runnable {
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String arg[]) {
		Multithreading5 mu = new Multithreading5();
		ThreadGroup th = new ThreadGroup("group 1");
		Thread t1 = new Thread(th, mu, "first");
		t1.start();
		Thread t2 = new Thread(th, mu, "second");
		t2.start();
		Thread t3 = new Thread(th, mu, "three");
		t3.start();

		System.out.println(th.getName() + "\n");
		System.out.println("active count: " + th.activeCount() + "\n");
		System.out.println("active group count: " + th.activeGroupCount() + "\n");
		th.list();
	}
}
