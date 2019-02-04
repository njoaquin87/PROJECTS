package java8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		String[] arr = new String[] { "P", "A", "V" };
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);

		// System.out.println("---------------");
		stream = Stream.of("V", "A", "P");
		stream.forEach(System.out::println);
		// System.out.println("---------------");
		List<String> list = Arrays.asList("Pavan", "Opencodez");
		stream = list.stream();

		list.parallelStream().forEach(System.out::println);

		Stream<String> a = list.stream().filter(element -> element.contains("dez"));
		a.forEach(System.out::println);

		boolean isValid = list.stream().anyMatch(element -> element.contains("P"));
		System.out.println(isValid);

		Employee e1 = new Employee(2, "Emp2", 3000);
		Employee e2 = new Employee(1, "Emp1", 3000);
		Employee e3 = new Employee(0, "Emp3", 200000);
		
		List<Employee> lista = new ArrayList<>();
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
		lista.stream().filter(employee -> employee.getSalary() > 100000).forEach(System.out::println);
	}
}
