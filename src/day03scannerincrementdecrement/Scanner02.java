package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner02 {
	
	 /*
	 	Type a program which calculates the area and the perimeter of a rectangle whose length and width are entered by user. 
		Hint 1: Area of a rectangle is width x length
		Hint 2: Perimeter of a rectangle is 2x (width + length)
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle...");
		double length = scan.nextDouble();
		
		System.out.println("Enter the width of the rectangle...");
		double width = scan.nextDouble();
		
		System.out.println("The area is " + width*length);//50
		
		System.out.println("The perimeter is " + 2*(width+length));//30
		
		scan.close();

	}

}
