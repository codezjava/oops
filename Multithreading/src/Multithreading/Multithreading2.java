package Multithreading;

class Firsttask implements Runnable {
	public void run() {
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

	}
}

public class Multithreading2 {
	public static void main(String arg[]) {
		Firsttask ft = new Firsttask();
		Thread t = new Thread(ft);

		System.out.println("thread name: " + t.getName());
		t.start();

		t.setName("one");
		System.out.println("using setName() method: " + t.getName());

		System.out.println("using getId() method: " + t.getId());

		System.out.println("using getState() method: " + t.getState());

		System.out.println("using currentThread() method: " + t.currentThread());

		System.out.println("using isAlive() method: " + t.isAlive());
	}
}
