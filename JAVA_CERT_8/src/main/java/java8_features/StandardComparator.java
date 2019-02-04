package java8_features;

import java.util.Comparator;

public class StandardComparator {

	Comparator<Employee> lambdaSortByName = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());

	public static void main(String args[]) {

	}
}
