package Multithreading;

class Sender {
	public void send(String msg) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + msg + "recived");
	}
}

class Mythread extends Thread {
	Thread t;
	String msg;
	Sender sen;

	Mythread(Sender sen, String str) {
		this.sen = sen;
		this.msg = str;

	}

	@Override
	public void run() {
		sen.send(msg);

	}

}

public class Multithreading8 {
	public static void main(String arg[]) {
		Sender se = new Sender();
		Mythread m1 = new Mythread(se, "hellow\t");
		Mythread m2 = new Mythread(se, "good bye\t");
		m1.start();
		m2.start();
	}
}
