import java.util.HashSet;

public class AppEmployee {

	public static void main(String[] args) {
		HashSet<Employee> empSet=new  HashSet<Employee>();
		empSet.add(new Employee(100, "Steven", "King", 123456.0));
		empSet.add(new Employee(109, "Neena", "Kochchar", 123456.0));
		empSet.add(new Employee(101, "Steven", "King", 123456.0));
		empSet.add(new Employee(103, "Steven", "King", 123456.0));
		empSet.add(new Employee(105, "Steven", "King", 123456.0));
		empSet.add(new Employee(104, "Steven", "King", 123456.0));
		empSet.add(new Employee(107, "Steven", "King", 123456.0));
		empSet.add(new Employee(108, "Steven", "King", 123456.0));
		empSet.add(new Employee(106, "Steven", "King", 123456.0));
		
		for(Employee e:empSet)
			System.out.println(e);
	}

}
