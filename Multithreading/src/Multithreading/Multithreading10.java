package Multithreading;

class Odd extends Thread {
	int maxOdd;
	SharedOddEven sh;

	Odd(int num, SharedOddEven sh) {
		this.maxOdd = num;
		this.sh = sh;

	}

	public void run() {
		int minOddNum = 1;
		try {
			while (minOddNum <= minOddNum) {
				sh.printOddNumber(minOddNum);
				minOddNum = minOddNum + 2;
            }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Even extends Thread {
	int maxEven;
	SharedOddEven sh;

	Even(int num, SharedOddEven sh) {
		this.maxEven = num;
		this.sh = sh;

	}

	public void run() {
		int minEvenNum = 2;
		try {
			while (minEvenNum <= minEvenNum) {
				sh.printEvenNumber(minEvenNum);
				minEvenNum = minEvenNum + 2;

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Multithreading10 {
	public static void main(String arg[]) {
		SharedOddEven sh = new SharedOddEven();
		Odd oddnum = new Odd(1, sh);
		Even evennum = new Even(2, sh);
		oddnum.start();
		evennum.start();
	}
}
