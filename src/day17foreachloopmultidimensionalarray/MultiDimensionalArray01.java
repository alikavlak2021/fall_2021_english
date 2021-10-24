package day17foreachloopmultidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		
		//How to create multidimensional array
		//If you use following syntax to create multidimensional array
		//inner arrays must have same number of elements
		int arr1[][] = new int[3][2];
		
		//How to print multidimensional array
		System.out.println(Arrays.deepToString(arr1));
		
		//How to assign values for specific indexes
		arr1[0][0] = 2;
		arr1[0][1] = 3;
		
		arr1[1][0] = 10;
		arr1[1][1] = 11;
		
		arr1[2][0] = 7;
		arr1[2][1] = -2;
				
		System.out.println(Arrays.deepToString(arr1));
		
		
		int arr2[][] = { {2, 11}, {5, -3, 10, 21, -8, 5} };
		//If you use Arrays.toString() for multidimensional arrays
		//you cannot see the elements, you will see the references on the console
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.deepToString(arr2));
		
		//Find the sum of all elements in an integer 2 dimensional array
		
		int arr3[][] = { {5, -2, 3}, {7}, {11, 45} };
		
		int sum = 0;
		for(int[] w : arr3) {
			for(int x : w) {
				sum = sum + x;
			}			
		}
		
		System.out.println(sum);//69

	}

}
