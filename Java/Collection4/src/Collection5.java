import java.util.LinkedList;

public class Collection5 {
	public static void main(String arg[]) {
		LinkedList<String> language = new LinkedList<>();
		language.add("java");
		language.add("c");
		language.add("c#");
		language.add("php");
		language.add("python");
		language.add("java");
		System.out.println("programming language:" + language);

		//apply removeIf() method
		language.removeIf(l->(l.charAt(0)=='v'));
		System.out.println("\nlanguage name does not start with \"v\"");
		for(String la:language)
		{
			System.out.print(la);
			System.out.print(", ");
		}
		
		
		if (language.contains("c")) {
			System.out.println("\n\nElement contains in linked list");
		} else
			System.out.println("Element is not linked list");

		// check the element index using index of method
		int i1 = language.indexOf("java");
		System.out.println("\nindex of \"java\" is:" + i1);

		int i2 = language.lastIndexOf("java");
		System.out.println("\nindex of\"java\" is:" + i2);
		
	    //using for loop
		System.out.println("\nprint the linked list using for loop");
		for(int i=0;i<language.size();i++)
		{
			System.out.println(language.get(i));
			
		}

		// using for each loop
		System.out.println("\nprint the linked list using foreach loop");
		for (String lan : language) {
			System.out.print(lan);
			System.out.print(", ");
		}

	}

}
