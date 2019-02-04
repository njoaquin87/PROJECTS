package java8_features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StandardComparator {

	Comparator<Employee> lambdaSortByName = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
	Comparator<Employee> lambdaSortById = (Employee e1, Employee e2) -> e1.getId() - e2.getId();
	Comparator<Employee> sortByName = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

	public StandardComparator() {
		Employee e1 = new Employee(2, "Emp2", 3000);
		Employee e2 = new Employee(1, "Emp1", 3000);
		Employee e3 = new Employee(0, "Emp3", 3000);
		
		List<Employee> lista = new ArrayList<>();
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.forEach(System.out::println);
		//lista.sort(lambdaSortByName);
		//Collections.sort(lista, lambdaSortByName);
		
		
		lista.sort(lambdaSortById);
		
		lista.forEach(System.out::println);
	}

	public static void main(String args[]) {

		StandardComparator aa = new StandardComparator();

	}
}
