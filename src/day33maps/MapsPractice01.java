package day33maps;

import java.util.HashMap;
import java.util.Map.Entry;
	/*
	   Type code to print non-repeated elements from an Array
	   String s[] = {"A", "Z", "A", "K", "T", "K"};  ==> You will print just "Z" and "T"
	 */

public class MapsPractice01 {

	public static void main(String[] args) {
		
		String s[] = {"A", "Z", "A", "K", "T", "K"};
		
		HashMap<String, Integer> resultMap = new HashMap<>();
		
		for(String w : s) {
			
			Integer numOfOccurences = resultMap.get(w);
			
			if(numOfOccurences==null) {
				resultMap.put(w, 1);
			}else {
				resultMap.put(w, numOfOccurences+1);
			}
	
		}
		
		System.out.println(resultMap);//{A=2, T=1, Z=1, K=2}
		
		for(Entry<String, Integer> w : resultMap.entrySet()) {
			
			if(w.getValue()==1) {
				
				System.out.println(w.getKey());
				
			}
			
		}

	}

}
