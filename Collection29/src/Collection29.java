import java.util.*;

class Employee {
	int id;
	String name;
	int age;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

//using Comparator method
class Employeeage implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		if (e1.age == e2.age)
			return 0;
		else if (e1.age > e2.age)
			return 1;
		else
			return -1;

	}
}

public class Collection29 {
	public static void main(String args[]) {

		// create an arrayList
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee(10, "rajee", 23));
		l1.add(new Employee(9, "rani", 22));
		l1.add(new Employee(11, "yamuna", 19));
		l1.add(new Employee(15, "aishu", 18));
		Collections.sort(l1, new Employeeage());
		for (Employee em : l1) {
			System.out.println(em.id + " " + em.name + " " + em.age);
		}

	}

}
