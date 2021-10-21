package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays04 {

	public static void main(String[] args) {
		
		// Sort the String array elements in ascending order according to their lengths.
		String srr[] = {"Jacksonville", "Miami", "KeyWe", "Tampa", "Virginia"};
		System.out.println(Arrays.toString(srr));
		
		//Sort in ascending by using the number of characters
//		Arrays.sort(srr, Comparator.comparingInt(String::length));//:: ==> Go to the class, find the method and use it
//		System.out.println(Arrays.toString(srr));
		
		//Sort in descending by using the number of characters
//		Arrays.sort(srr, Comparator.comparingInt(String::length).reversed());
//		System.out.println(Arrays.toString(srr));
		
		//Sort in descending order, if there is multiple elements in same length put them in alphabetical order
		Arrays.sort(srr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
		System.out.println(Arrays.toString(srr));
		
		//Note: "Natural Order" means i)Alphabetical order for Strings ii)Ascending order for numbers
	}

}
