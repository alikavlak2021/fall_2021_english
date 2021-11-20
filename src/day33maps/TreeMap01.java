package day33maps;

import java.util.HashMap;
import java.util.TreeMap;

/*
	 	1)TreeMap puts the entries in natural order by using keys.
	 	2)TreeMap does not accept "null" in Keys but accepts multiple "null"s in values.
	 	3)TreeMap is not thread-safe and is not synchronized
	 	4)TreeMap is the slowest map in Java because of the natural order
	 */

public class TreeMap01 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm1 = new TreeMap<>();
		tm1.put("Ali", 3000);
		tm1.put("Tom", 500);
		tm1.put("Alexandra", 12000);
		tm1.put("Mark", 5000);
		tm1.put("Angelina", 23000);
		//tm1.put(null, 23000);//If you put "null" in keys, it throws NullPointerException
		tm1.put("Walker", null);//null in values are accepted
		tm1.put("Talker", null);
		
		System.out.println(tm1);
		
		/*
		   What is the best way to get a map whose elements are natural ordered by keys? 
		*/
		
		//1.Way:Create a TreeMap and put the elements
		Long t1 = System.nanoTime();
		TreeMap<String, Integer> tm2 = new TreeMap<>();
		tm2.put("Ali", 3000);
		tm2.put("Tom", 500);
		tm2.put("Alexandra", 12000);
		tm2.put("Mark", 5000);
		tm2.put("Angelina", 23000);
		tm2.put("Brad", 12000);
		tm2.put("Kazim", 5000);
		tm2.put("Maria", 23000);
		System.out.println("First way: " + tm2);
		Long t2 = System.nanoTime();
		
		//2.Way:Create a HashMap, put the elements in the HashMap then convert HashMap to TreeMap
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("Ali", 3000);
		hm2.put("Tom", 500);
		hm2.put("Alexandra", 12000);
		hm2.put("Mark", 5000);
		hm2.put("Angelina", 23000);
		hm2.put("Brad", 12000);
		hm2.put("Kazim", 5000);
		hm2.put("Maria", 23000);		
		TreeMap<String, Integer> tm3 = new TreeMap<>(hm2);
		System.out.println("Second way: " + tm3);
		Long t3 = System.nanoTime();
		
		System.out.println("First Way:" + (t2-t1));
		System.out.println("Second Way:" + (t3-t2));
	}

}
