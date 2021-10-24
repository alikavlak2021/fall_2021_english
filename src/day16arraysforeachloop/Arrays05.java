package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

	public static void main(String[] args) {
		
		//Find the longest word in a String		
		String s = "Ali Can went to school to learn";
		
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));//[Ali, Can, went, to, school, to, learn]
				
		Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
		
		System.out.println(Arrays.toString(words)); //[school, learn, went, Can, Ali, to, to]
		
		System.out.println(words[0]);
		
		//Get just the year from date in the "mm/dd/yyyy" format
		String date = "10/05/2021";		
		String arr[] = date.split("/");
		System.out.println(Arrays.toString(arr));		
		System.out.println(arr[2]);//2021
						
		
		
		//Get the initials of the student names from the given String
		
		String t = "Ali Can, Veli Han, Mary Star went to school by bus";
		
		String u[] = t.split(", "); // u = [Ali Can, Veli Han, Mary Star went to school by bus]
		
		System.out.println(Arrays.toString(u));

		String initials = "";

		for(int i=0; i<u.length; i++) {
			int idx = u[i].indexOf(" ");
			initials = u[i].substring(0,1) + u[i].substring(idx + 1, idx + 2);					
			System.out.print(initials + " ");
		}

	}

}
