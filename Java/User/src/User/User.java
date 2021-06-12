package User;

public class User {
	public static String myClassVar = "class or static variable";

	public static void main(String[] args) {

		User obj = new User();
		User obj2 = new User();
		User obj3 = new User();

		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		obj2.myClassVar = "Changed Text";

		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}
}
