import java.util.HashMap;
import java.util.Map;

class Employee {
	private Integer id;
	private String name;
	private String city;

	public Employee(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;

	}

	public String getNane() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String setCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ",city='" + city + '\'' + '}';
	}
}

public class Collection26 {
	public static void main(String age[]) {
		Map<Integer, Employee> em = new HashMap<>();
		em.put(12, new Employee(12, "viji", "paris"));
		em.put(13, new Employee(13, "nandhini", "chennai"));
		em.put(14, new Employee(14, "rajee", "bangaluru"));
		em.put(11, new Employee(11, "ananthi", "new york"));

		System.out.println(em);

	}

}
