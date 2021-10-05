package day03scannerincrementdecrement;

import java.util.Scanner;

public class InterviewQuestion01 {

	 /*
	 	Get 2 numbers from user then swap the numbers
	 	User ==> a=2 and b=5 the a=5 and b=2
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first integer...");
		int first = scan.nextInt();
		
		System.out.println("Enter the second integer...");
		int second = scan.nextInt();
		
		System.out.println("Before swap: " + first + " - " + second);
		
		int temporary = 0;
		
		temporary = first;
		
		first = second;
		
		second = temporary;
		
		System.out.println("After swap: " + first + " - " + second + " - " + temporary);

	}

}
