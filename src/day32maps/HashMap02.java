package day32maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap02 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("Ali", 3);
		hm1.put("Velihan", 7);
		hm1.put("Maria", 5);
		
		//Print all entries on the console in different lines
		Set<Entry<String, Integer>> mySetFromMap = hm1.entrySet();
		
		for(Entry<String, Integer> w : mySetFromMap) {
			System.out.println(w);
		}
	}
}
