package java8_features;

import java.util.HashMap;
import java.util.Map;

public class IterationMap {

	public static void main(String[] args) {
		
		Map<Integer, Employee> items = new HashMap<>();
		items.put(500,new Employee(500, "Shifoo", 150000));
		items.put(504, new Employee(504, "Oogway", 120000));
		items.put(503, new Employee(503, "Tigress", 100000));
		items.put(730, new Employee(730, "Mantis", 45000));
		 
		System.out.println("Printing Map with forEach");
		items.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		 
		System.out.println("\nPrinting Map with forEach");
		items.forEach((k,v)->{
		 System.out.println("Key : " + k + " Value : " + v);
		 if("Oogway".equals(v.getName())){
		 System.out.println("Hello Master " + v.getName());
		 }
		});

	}

}
