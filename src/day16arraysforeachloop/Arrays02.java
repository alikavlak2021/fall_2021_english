package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
	
	//Check if array elements are sorted or not

	public static void main(String[] args) {
		
		String s1[] = {"A", "T", "C"};
		System.out.println("Before sorting: " + Arrays.toString(s1));
		
		//If you use "String s2[] = s1;" instead of using "copyOf()" method
		//everytime you will get "Array elements are sorted" message. Because when you sort s1, s2 will be sorted 
		//as well. 
		//When you do direct assignment, Java does not create a new container to save memory.
		//But copyOf() method makes Java create a new container even the arrays are same.
		String s2[] = Arrays.copyOf(s1, s1.length);
		//String s2[] = s1;
		System.out.println("Before sorting: " + Arrays.toString(s2));
		
		Arrays.sort(s1);
		System.out.println("After sorting: " + Arrays.toString(s1));
		System.out.println("After sorting: " + Arrays.toString(s2));
		
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("Array elements are sorted");
		}else {
			System.out.println("Array elements are not sorted");
		}
	}
}
