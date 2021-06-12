package Enum;

public class Enum1 {
	enum colour {
		BLUE, WHITE, BLOCK, GREEN;

	}

	public static void main(String arg[]) {
		System.out.println("method of java enum class");
		System.out.println("using valueof()  method=" + colour.valueOf("BLOCK"));
		System.out.println("using toString() method=" + colour.BLUE.toString());
		System.out.println("using name() method=" + colour.BLOCK.name());
		System.out.println("using compareTo() method= " + colour.GREEN.compareTo(colour.BLOCK));
		System.out.println("using ordinal() method=" + colour.WHITE.ordinal());

		for (colour c : colour.values()) {
			System.out.println(c + " ");
		}

	}

}
