package stringinputs;
class Input
{
	static String a1;
	static String a2;
	static String a5="\tname:A.Vijayarani"+"\t\tage:20"+"\t\tweight:60.00"+"\t\thight:160ft";
	static String a6="ananthi";
	static int a7=19;
	static float a8=52.0546f;
	static double a9=150.0123d;
	
}

public class StringInputs {
	static String a3="\n\n\tLOVE ISN'T ALWAYS PERFECT\n\n"
			+ "In isn't a fairytale or a\n"
			+ "storybook.And it doesn't\n"
			+ "always come easy.\n"
			+ "Love is overcoming obstacles,\n"
			+ "facing challenges,fighting to\n"
			+ " be together,holding on&\n"
			+ " never letting go.It is a short\n"
			+ "word,easy to spell,difficult to \n"
			+ "define,&impossible to live\n"
			+ "without.\n"
			+ "Love is work,but most of all,\n"
			+ "Love is realizing that every\n"
			+ "hour,every minute,&every\n"
			+ "second was worth it because\n"
			+ "you did it together.";
	 static String a4="A.ananthi\n"
			+ "\t1.C programming                     =55/100\n"
			+ "\t2.Operating system                  =81/100\n"
			+ "\t3.Basic electornic                  =55/100\n"
			+ "\t4.C programming lab                 =86/100\n"
			+ "\t5.Linex lab                         =90/100\n"
			+ "\t6.Basic electornic lab              =89/100\n"
			+ "\t7.Computer application pratical     =99/100\n"
			+"\t8.Total                             =555/700\n"
			+ "\t9.Average                           =79.2857%\n"
			+ "\t10.Result                           =pass";
	public static void main(String[] arg) {
			Input.a1="A.vijayarani\t20 "
					+ "\nA.ananthi\t19 "
					+ "\nA.kogilavani\t41 "
					+ "\nK.aranganathan\t54 ";
			Input.a2="\"you cannot undo the moves but you can make the next step better\"";
			System.out.println(Input.a1);
			System.out.println("---------------------------------");
			System.out.println(Input.a2);
			System.out.println("---------------------------------");
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(Input.a5);
			System.out.println("---------------------------------");
			System.out.println("\tname:"+Input.a6+"\tage:"+Input.a7+"\tweight:"+Input.a8+"\thight:"+Input.a9);
		
	}
	

}
