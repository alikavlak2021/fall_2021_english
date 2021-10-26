package day18multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	//Convert 2 dimensional array to 1 dimensional array

	/*
	 	Logic:
	 	Create 1 dimensional array and transfer all elements from 2 dimensional array to 1 dimensional array
	 			i)To create a 1 dimensional array you need the number of elements you will put in 
	 			ii)To get the number of elements in 2 dimensional array, you need to add the lengths of the inner arrays
	 */

	public static void main(String[] args) {
		
		int arr[][] = { {1,2}, {3,4,5}, {6, 7, 9, 10} };
		
		//Get the number of elements from array "arr"
		int sum = 0;		
		for(int[] w : arr) {			
			sum = sum + w.length;			
		}
		
		//Create a 1 dimensional array by using the number of elements of "arr" as capacity of "brr"
		int brr[] = new int[sum];
		
		//Create an int container for the index of brr 
		int idx = 0;

		for(int[] w : arr) {

			for(int x : w) {

				brr[idx] = x;
				idx++;
			}
			
		}
		
		System.out.println(Arrays.toString(brr));
		

	}

}
