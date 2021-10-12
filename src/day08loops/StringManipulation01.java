package day08loops;

import java.util.Scanner;

public class StringManipulation01 {
	
	/*
 		 Ask user to enter SSN (9 digits) 
	     Print the SSN on the console after converting first 5 digits to *
	     Ex: 123456789 ==> *****6789
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your social security number...");
		String ssn = scan.next();
		
		System.out.println(ssn);
		
		String lastFourDigits = ssn.substring(5);
		String firstFiveDigits = "*****";
		
		System.out.println(firstFiveDigits + lastFourDigits);
		
		scan.close();

	}

}
