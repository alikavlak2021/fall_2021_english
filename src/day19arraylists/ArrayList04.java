package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
	
	//Find the closest 2 integers in the given list

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(15);
		list1.add(18);
		list1.add(21);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);		
		int minDiff = Integer.MAX_VALUE;

		for(int i = 1; i<list1.size(); i++) {
			minDiff = Math.min(minDiff, list1.get(i) - list1.get(i-1));
		}
		for(int i = 1; i<list1.size(); i++) {		
			if(list1.get(i) - list1.get(i-1) == minDiff) {
				System.out.println(list1.get(i) + " and " + list1.get(i-1));
			}
		}

	}

}
