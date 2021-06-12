class MyException extends Exception {
	MyException(String s) {
		super(s);
	}

}

class OwnException {

	static void validate(int age) throws MyException {
		if (age < 18) {
			throw new MyException("Invalid age");
		} else
			System.out.println("Welcome to vote");
	}

	public static void main(String arg[]) {
		try {
			validate(18);
		} catch (Exception e) {
			System.out.println("Exception occured:" + e);

		}
		System.out.println("**********");
	}
}
