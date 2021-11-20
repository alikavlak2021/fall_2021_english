package day33maps;

import java.util.HashMap;

	/*
		1)There are 16 buckets as default when you create a HashMap
	    2)Buckets use indexes from 0 to 15
	    3)Every bucket has LinkedList
	    4)When we use put() method, Java creates a HashCode(integer) of the key to access the entry faster
	    5)But the HashCode will be greater than 15 what can Java do?
	    	i)Can increase the index 
	    	ii)Can convert the HashCode value to the base 16
	    	Java will do the second because the first uses memory too much.
	    6)LinkedList in every bucket stores 4 data
	    	i)HashCode (Inside the first part)
	    	ii)Key (Inside the second part)
	    	iii)Value (Inside the third part)
	    	iv)Pointer(Next) (Inside the fourth part) (If there is no any node pointer will point null)
	    7)What if same HashCode created from different keys
	    	In a HashMap, if two or more Keys have the same hash code then 
	    	the situation is referred to as Hash Collision. 
	    	Hash Collisions are a common phenomena of hashing functions. 
	    	A good design of the hashing function may reduce the occurences of same hash code 
	    	for different Keys but it cannot be avoided alltogether.  	
	    8)If the key is null it will use index 0
	 */

public class HashMap03 {
	
	public static void main(String[] args) {
		
		//How HashMaps work in Java
		HashMap<String, Integer> hm1 = new HashMap<>();             
		
		hm1.put("abc", 5);
		
		//Normally Java wants to create unique hashcodes
		//but sometimes HashCodes can be same, this is called HashMap
		//Collusion.
		System.out.println("FB".hashCode());//2236
		System.out.println("Ea".hashCode());//2236
		
		hm1.put(null, 12);
	}

}
