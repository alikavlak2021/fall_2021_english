package day20passbyvaluedatetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue01 {
	
	/*
	 	Pass By Value: If you use any variable inside a method;
	 	               Java creates a copy of the variable and use the copy inside the method.
	 	               Java does not use the variable itself inside the method.
	 	               Java does that to protect original value of the variable.
	 	               This process is called "Pass by value" in Java.
	 	               
	    Note: If  you want to update original value by using any method, you have to do assignment, otherwise
	          just by calling method does not update the variable which you used inside the method call.               
	 */

	public static void main(String[] args) {
		
		int number = 12;
		//If you do not use assignment Java will protect original value
		System.out.println("From the method: " + increase(number));//17		
		System.out.println("After just method call: " + number);//12
		
		int updateOriginalValue = 15;
		//To update original value, you have to do assignment
		updateOriginalValue = increase(updateOriginalValue);
		updateOriginalValue = increase(updateOriginalValue);
		System.out.println("After method call + assignment: " + updateOriginalValue);
				
		//If you cannot update the value of a data type without assignment, those data types are called
		//"immutable" data types. So String is immutable.
		String s = "Ali";
		System.out.println("From the method: " + updateString(s));//Ali!
		System.out.println(s);//Ali
				
		//In Lists, we can update the value without using assignment, because of that Lists are called "mutable" data types
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(13);
		l.add(14);		
		System.out.println("Before method call: " + l);		
		System.out.println("From the method: " + updateList(l));		
		System.out.println("After method call: " + l);
				
		//Arrays are mutable
		int arr[] = new int[3];
		arr[0] = 14;
		arr[1] = 12;
		arr[2] = 13;		
		System.out.println(Arrays.toString(arr));//[14, 12, 13]		
		Arrays.sort(arr);		
		System.out.println(Arrays.toString(arr));//[12, 13, 14]

	}
	
	public static int increase(int i) {		
		return i + 5;		
	}
	
	public static String updateString(String s) {		
		return s + "!";		
	}
	
	public static List<Integer> updateList(List<Integer> list){
		list.remove(0);
		return list;
	}

}
