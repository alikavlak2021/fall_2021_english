package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
	
	//How to check if multiple elements exist in a List
	//["A", "M", "C", "K", "B"] ==> If "A", and "C", and "K" exist in the list

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		
		//1.Way:
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("K");
		//Returns true if list1 contains all of the elements of the list2, otherwise it will return false
		System.out.println(list1.containsAll(list2));
				
		//2.Way:
		System.out.println(list1.containsAll(Arrays.asList("A", "C", "K")));
		
		/*
		 	Note: When you use Arrays.asList() method you should be careful about not to change the length
		*/
		List<Integer> list3 = Arrays.asList(2, 5, 3, 4);
		//list3.add(7);//UnsupportedOperationException
		//list3.remove(1);//UnsupportedOperationException
		
		//clear() removes all elements from a list
		//list3.clear();//UnsupportedOperationException
		
		System.out.println(list3.contains(3));
		
		//Remove M and put S in the place of M
		// [A, M, C, K, B] ==> [A, S, C, K, B]
		
		//1.Way: Not recommended
		int idxOfM = list1.indexOf("M");		
//		list1.remove("M");		
//		list1.add(idxOfM, "S");		
//		System.out.println(list1);//[A, S, C, K, B]
		
		
		//2.Way:
		//set() method is used to update an element at a specific index
		list1.set(idxOfM, "S");
		System.out.println(list1);//[A, S, C, K, B]
	}

}
