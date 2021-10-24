package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
	
	//Check if 2 arrays are same or not
	//If 2 arrays are same; same elements must be in the same index

	public static void main(String[] args) {
		
		int arr1[] = {5, 12, 32};
		int arr2[] = {5, 12, 32};
		
		//1.Way: I typed my code to check if the arrays are some or not
		int counter = 0;
		
		if(arr1.length == arr2.length) {
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]!=arr2[i]) {
					counter++;
					break;
				}				
			}			
			if(counter == 1) {
				System.out.println("Arrays are not same");
			}else {
				System.out.println("Arrays are same");
			}
		}else {
			System.out.println("Arrays are not same");			
		}
		
		//2.Way: There is a build in method in Arrays Class to check if the arrays are some or not
		boolean isSame = Arrays.equals(arr1, arr2);
		if(isSame) {
			System.out.println("Arrays are same");
		}else {
			System.out.println("Arrays are not same");
		}

	}

}
