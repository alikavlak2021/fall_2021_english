package day18multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	
	/*
	 	What is the cons of "Arrays"?
	 	Arrays are not flexible in length. 
	 	If you declared an array with capacity "10", you cannot make it 11 or more.
	 	Arrays are fixed in length.
	 	
	 	1) ArrayList is flexible in length.
	 	2) ArrayList accepts just non-primitive data types
	 */

	public static void main(String[] args) {
		
		//How to declare an ArrayList
		//1.Way:
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1);//[]
		
		//2.Way:
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println(list2);//[]
		
		//3.Way: Recommended
		List<Integer> list3 = new ArrayList<>();
		
		//How to add elements into a list
		//add() method adds the elements to the end everytime. add() method add the elements into a list in insertion order
		list3.add(12);
		list3.add(7);
		list3.add(3);
		
		//How to add an element into a specific index
		list3.add(1, 8);
		list3.add(3, 15);

		System.out.println(list3);//[12, 8, 7, 15, 3]
		
		//How to get the number of elements in a list
		System.out.println(list3.size());//	5	
		System.out.println(list1.size());// 0
		
		//How to check if a list is empty or not
		list1.isEmpty();//true		
		list3.isEmpty();//false
		
		//How to check if a list has a specific element
		System.out.println(list3.contains(12));//true
		System.out.println(list3.contains(21));//false
		
		
		//How to remove a specific element from a list
		//If you put an integer inside the remove() parenthesis, Java will use it as index.
		//If you use remove() with index, it will return the removed element
		System.out.println(list3.remove(2));// 7
		System.out.println(list3);
		
		List<String> list4 = new ArrayList<>();
		list4.add("Ali Can");
		list4.add("Veli Han");
		list4.add("Mary Star");
		list4.add("Angelina Julie");		
		list4.add("Brad Pitt");
		
		System.out.println(list4);//[Ali Can, Veli Han, Mary Star, Angelina Julie, Brad Pitt]
		
		list4.remove(2);
		System.out.println(list4);//[Ali Can, Veli Han, Angelina Julie, Brad Pitt]
		
		list4.remove("Brad Pitt");
		System.out.println(list4);//[Ali Can, Veli Han, Angelina Julie]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
