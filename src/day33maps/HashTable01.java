package day33maps;

import java.util.Hashtable;

/*
	 	1)HashTable is a Map
	 	2)HashTable is thread-safe and synchronized
	 	3)HashTable does not accept "null" in "key" and in "value"
	 	4)HashTable does not put the elements in any order
	 	5)HashTable is slower than HashMap
	 */

public class HashTable01 {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht1 = new Hashtable<>();		
		ht1.put("Ali", 3000);
		ht1.put("Tom", 500);
		ht1.put("Alexandra", 12000);
		ht1.put("Mark", 5000);
		ht1.put("Angelina", 23000);
		//ht1.put(null, 5000);//If you use "null" as key in HashTable, it throws NullPointerException
		//ht1.put("Veli", null);//If you use "null" as value in HashTable, it throws NullPointerException
		
		System.out.println(ht1.containsKey("Ali"));//true
		System.out.println(ht1.containsKey("Ayse"));//false
		
		System.out.println(ht1.containsValue(3000));//true
		System.out.println(ht1.containsValue(3333));//false
		
		//contains() is same with the containsValue() but prefer to use containsValue()
		System.out.println(ht1.contains(3000));
		
		Hashtable<String, Integer> ht2 = new Hashtable<>();		
		ht2.put("Ali", 3000);
		ht2.put("Tom", 500);
		ht2.put("Alexandra", 12000);
		ht2.put("Mark", 5000);
		ht2.put("Angelina", 23000);
		
		System.out.println(ht1);
		System.out.println(ht2);
		
		System.out.println(ht1.equals(ht2));//It does not check the order of elements.
		                                    //It checks i)The number of entries  i)The entires
		
		//ht1.size()==0 and ht1.isEmpty() are same but ht1.isEmpty() is better to use
		System.out.println(ht1.size()==0);//false
		System.out.println(ht1.isEmpty());//false
	}

}
