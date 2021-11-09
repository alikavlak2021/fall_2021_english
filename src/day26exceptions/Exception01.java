package day26exceptions;

	/*
	 	1) Exception is "unexpected issue"
	 	2) If there is any Exception
	 		i)Stops execution
	 		ii)Throws Exception
	    3) try-block cannot be used alone
	    4) After try-block we can use multiple catch-block
	    5) When you use multiple catch block, if there is parent-child relationship between the Exception Classes
	       child class must be at the top.
	       But if there is no parent-child relationship order is not important.
	 */

public class Exception01 {

	public static void main(String[] args) {
		
		System.out.println(division(12, 3));	
		System.out.println(division(10, 10));		
		System.out.println(division(0, 10));		
		System.out.println(division(10, 0)); // ArithmeticException		
		System.out.println("Hello");				
		
		int arr[] = {2, 3, 7, 1, 5};		
		System.out.println(addTwoConsecutiveArrayElements(arr, 0));		
		System.out.println(addTwoConsecutiveArrayElements(arr, 1));		
		System.out.println(addTwoConsecutiveArrayElements(arr, 2));		
		System.out.println(addTwoConsecutiveArrayElements(arr, 3));		
		System.out.println(addTwoConsecutiveArrayElements(arr, 4)); // ArrayIndexOutOfBoundsException
		
		int brr[] = {12, 2, 0, 3, 1};
		System.out.println(divideTwoConsecutiveArrayElements(brr, 0));//6.0	
		System.out.println(divideTwoConsecutiveArrayElements(brr, 1));//Exception will be handled			
		System.out.println(divideTwoConsecutiveArrayElements(brr, 2));//0	
		System.out.println(divideTwoConsecutiveArrayElements(brr, 3));//1		
		System.out.println(divideTwoConsecutiveArrayElements(brr, 4));//Exception will be handled
	}
	
	public static double division(int a, int b) {		
		int result = 0;		
		try {			
			result = a/b;			
		}catch(ArithmeticException e) {			
			System.out.println("Do not divide by zero - " + e.getMessage());			
		}		
		return result;		
	}
	
	public static int addTwoConsecutiveArrayElements(int arr[], int index) {		
		int result = 0; 		
		try {			
			result = arr[index] + arr[index+1];			
		}catch(ArrayIndexOutOfBoundsException e) {			
			System.out.println("Do not use non-existing indexes - " + e.getMessage());			
		}		
		return result;		
	}
	
	public static double divideTwoConsecutiveArrayElements(int brr[], int index) {
		
		double result = 0;
		
		try {
			
			result = brr[index] / brr[index+1];	
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Do not use non-existing indexes - " + e.getMessage());
			
		}catch(ArithmeticException e) {
			
			System.out.println("Do not try to divide by zero - " + e.getMessage());
			
		}
		
		return result;
		
	}


}
