package chapter3;

import java.util.Arrays;

/********
 * book: OCA Oracle Certified Associate JAVA SE 8 (2014)
 * Chapter 3: Core Java APIs	
 * ****/
public class BinarySearch {

	
	public static void main(String args[]){
		int numbers[] = {	2,4,6,8,10,15,20};
		
		System.out.println("1:"+Arrays.binarySearch(numbers, 2));
		System.out.println("2:"+Arrays.binarySearch(numbers, 4));
		System.out.println("3:"+Arrays.binarySearch(numbers, 1));
		System.out.println("4:"+Arrays.binarySearch(numbers, 3));
		System.out.println("5:"+Arrays.binarySearch(numbers, 9));
		System.out.println("5:"+Arrays.binarySearch(numbers, 20));
	}
}
