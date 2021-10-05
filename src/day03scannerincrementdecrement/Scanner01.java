package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner01 {
	
	/*
	 	Type a program which calculates the area and the perimeter of a square whose side length is entered by user. 
		Hint 1: Area of a square is length x length
		Hint 2: Perimeter of a square is 4 x length
	 */

	public static void main(String[] args) {
		
		//Get data from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the length of a side...");
		double sideLength = scan.nextDouble();
		
		System.out.println("The area: " + sideLength*sideLength);
		
		System.out.println("The perimeter: " + 4*sideLength);
		
		scan.close();

	}

}
