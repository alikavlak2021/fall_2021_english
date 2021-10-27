package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	//How to Remove Duplicates from ArrayList
	
	/*
	 	Logic:
	 	Create a new list, then transfer the elements 
	 				i) if they are not repeated
	 				ii) if an element is repeated transfer it just once
	 	            [2, 3, 2, 2, 5, 3, 1, 5 ]  ==>   [2, 3, 5, 1]		
	 */
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(3);
		list1.add(2);
		list1.add(2);
		list1.add(5);
		
		List<Integer> list2 = new ArrayList<>(); // Will have unique elements...

		for(Integer w : list1) {

			if(!list2.contains(w)) {
				list2.add(w);
			}
			
		}		
		System.out.println(list2);

	}

}
