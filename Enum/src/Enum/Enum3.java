package Enum;

enum Bag {
	BLUEPEN(7), BLOCKPEN(5), BOOK(2), NOTE(8);

	private int n;

	Bag(int b) {
		n = b;
	}

	public int count() {
		return n;
	}
}

public class Enum3 {
	public static void main(String arg[]) {
		System.out.println("count of BluePen=" + (Bag.BLUEPEN.count()));
		System.out.println("count of BlockPen=" + (Bag.BLOCKPEN.count()));
		System.out.println("count of Book=" + (Bag.BOOK.count()));
		System.out.println("count of Note=" + (Bag.NOTE.count()));
	}
}
