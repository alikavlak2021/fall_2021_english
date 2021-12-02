package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        
        printInUpperCases01(l);
        System.out.println();
        //printInUpperCases02(l);
        printElementsSortedByLength(l);
        System.out.println();
        printElementsReversedSortedByLength(l);
        System.out.println();
        printDistinctSortedByLastChar(l);
        System.out.println();
        printSortedByLengthFirstThenSortedByInitial(l); 
        System.out.println();
        removeIfTheLengthIsGreaterThanFive(l);
        
		
	}
	
	//1) Create a method to print all list elements in uppercase
	//1.Way:
	public static void printInUpperCases01(List<String> list) {		
		list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);		
	}
	
	//2.Way:
//	public static void printInUpperCases02(List<String> list) {			
//		list.replaceAll(String::toUpperCase);		
//		System.out.println(list);
//	}
	
	//2) Create a method to print the elements after ordering according to their lengths
	public static void printElementsSortedByLength(List<String> list) {
		
		list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInTheSameLineWithSpace);
		
	}
	
	//3) Create a method to print the elements after ordering according to their lengths (In reverse order)
	public static void printElementsReversedSortedByLength(List<String> list) {		
		list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInTheSameLineWithSpace);		
	}
	
	//4) Create a method to sort the distinct elements by using their last characters
	public static void printDistinctSortedByLastChar(List<String> list) {		
		list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInTheSameLineWithSpace);		
	}
	
	//5) Create a method to sort the elements according to their lengths then according to their first character
	public static void printSortedByLengthFirstThenSortedByInitial(List<String> list) {		
		list.
			stream().
			sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar)).
			forEach(Utils::printInTheSameLineWithSpace);				
	}

	//6) Remove the elements if the length of the element is greater than 5
	public static void removeIfTheLengthIsGreaterThanFive(List<String> list) {
		
		list.removeIf(t->t.length()>5);
		
		System.out.println(list);
		
	}

}
