class CustomException extends Exception {
	private String message = null;

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public CustomException(Throwable c) {
		super(c);
	}

	public String toString() {
		return message;
	}

	public String getMessage() {
		return message;
	}
}

public class OwnException2 {
	public static void main(String[] args) {
		try {
			validate(null);
		} catch (CustomException e) {
			System.out.println("CustomException occured:" + e.getMessage());

		}
	}

	static void validate(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("value is null");
		}
	}

}
