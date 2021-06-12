import java.util.ArrayList;

class Collection {
	public static void main(String arg[]) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("pink");
		colors.add("blue");
		colors.add("green");
		colors.add("orange");
		colors.add("yellow");
		System.out.println("colors:\t" + colors);

		// remove the element of an array list
        colors.remove("green");
		System.out.println("colors:\t" + colors);

		// Add element of an array list to another array list
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("block");
		colours.add("white");
		colours.addAll(colors);
		System.out.println("addAll colors:\t" + colors);

		// change the element of the array list
		colors.set(2, "red");
		System.out.println("change colors:\t" + colors);
		
		//remove all element of an array list
		colours.removeAll(colours);
		System.out.println("colours:"+colours);
		
		//clean the array list
		colors.clear();
		System.out.println("colors:"+colors);
	}

}
