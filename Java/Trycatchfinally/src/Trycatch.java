class Example {
	 void mark(int m) {
		 try {
		if (m > 35) {

			throw new ArithmeticException("pass");
		} else {
			System.out.println("fail");
		}
		 }
		 finally
		 {
			 System.out.println("**********");
		 }
	 }
}
public class Trycatch {
	public static void main(String[] args) {
		Example e1=new Example();
		e1.mark(37);
	}
}
