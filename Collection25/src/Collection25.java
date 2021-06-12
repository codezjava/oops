import java.util.TreeMap;
import java.util.Map;

class Book {
	int id;
	String name;
	int quantity;

	public Book(int id, String name, int quantity)

	{
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
}

public class Collection25 {
	public static void main(String arg[]) {
		Map<Integer, Book> m = new TreeMap<Integer, Book>();

		Book b1 = new Book(11, "data base", 22);
		Book b2 = new Book(22, "operating System", 11);
		Book b3 = new Book(33, "Software Engineering", 10);

		m.put(3, b1);
		m.put(1, b3);
		m.put(2, b2);

		for (Map.Entry<Integer, Book> value : m.entrySet()) {
			int key = value.getKey();
			Book b = value.getValue();
			System.out.println(key + ":");
			System.out.println(b.id + " " + b.name + " " + b.quantity);
		}

	}

}
