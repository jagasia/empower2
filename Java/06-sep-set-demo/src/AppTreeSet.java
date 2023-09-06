import java.util.TreeSet;

public class AppTreeSet {

	public static void main(String[] args) {
		TreeSet<Employee> empSet=new  TreeSet<Employee>(new EmployeeFirstNameComparator());
		empSet.add(new Employee(100, "Steven", "King", 123456.0));
		empSet.add(new Employee(109, "Neena", "Kochchar", 123456.0));
		empSet.add(new Employee(100, "Steven", "King", 123456.0));
		empSet.add(new Employee(103, "Steven", "King", 123456.0));
		empSet.add(new Employee(100, "Steven", "King", 123456.0));
		empSet.add(new Employee(104, "Steven", "King", 123456.0));
		empSet.add(new Employee(100, "Steven", "King", 123456.0));
		empSet.add(new Employee(108, "Steven", "King", 123456.0));
		empSet.add(new Employee(106, "Steven", "King", 123456.0));
		
		for(Employee e:empSet)
			System.out.println(e);
	}

}
