import java.util.*;
 class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee em) {
		if (id == em.id)
			return 0;
		else if (id > em.id)
			return 1;
		else
			return -1;
	}

}

public class Collection28 {
	public static void main(String args[]) {
		
		//create the arrayList
		ArrayList<Employee> a1=new ArrayList<Employee>();
		
		//using add method
		a1.add(new Employee(12,"viji",20));
		a1.add(new Employee(11,"ananthi",19));
		a1.add(new Employee(13,"nandhini",22));
		a1.add(new Employee(14,"kogi",34));
		
		Collections.sort(a1);
		for(Employee em:a1)
		{
			System.out.println(em.id+" "+em.name+" "+em.age);
		}
	}
}


